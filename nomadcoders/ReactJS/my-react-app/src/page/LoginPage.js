import React from 'react';
import {useParams} from 'react-router-dom';

const LoginPage = () => {

    const id = useParams();
    
    return (
        <div>
            {id} 페이지
        </div>
    );
};

export default LoginPage;