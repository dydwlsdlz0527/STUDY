import React from 'react';
import useAxios from './useAxios';



const App = () => {

  const {loading, data, refetch} = useAxios({
    url:"https://yts.mx/api/v2/list_movies.json"
  });

 // console.log(`Loading: ${loading }\nError : ${error} \n Data : ${JSON.stringify(data)}}`);

  return (
    <div>
        <h1>{data && data.status}</h1>
        <h2>{loading && "Loading"}</h2>
        <button onClick = {refetch}>Refetch</button>
    </div>
  );
};

export default App;