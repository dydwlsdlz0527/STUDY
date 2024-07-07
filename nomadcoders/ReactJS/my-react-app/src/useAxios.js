import defaultAxios from "axios";
import { useEffect, useState } from "react";

//axios는 default URL을 설정하거나 자동으로 헤더를 설정하는 것을 허용한다.
//axios instance를 얻지 못한다면 defaultAxios에서 인스턴스를 얻어온다.
const useAxios = (opts, axiosInstance = defaultAxios)=>{

    
    const [state, setState] = useState({
        loading : true,
        error : null,
        data : null,
    });

    const [trigger, setTrigger] = useState(0);
    const refetch = () => {
        setState({
            ...state,
            loading : true,
        });
        setTrigger(Date.now());
    };

    useEffect(()=>{
        axiosInstance(opts).then((data) => {
            setState({
                ...state,
                loading: false,
                data
            });
        }).catch(error => {
            setState({...state, loading:false, error});
        });
    }, [trigger]);

    if(!opts.url){
        return;
    }

    return {...state,refetch};
};

export default useAxios;