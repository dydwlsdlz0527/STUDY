import React from 'react';
import ReactDOM from 'react-dom/client';
import CommentList from './chapter_05/CommentList';
import './index.css';
import reportWebVitals from './reportWebVitals';

// const root = ReactDOM.createR);
// root.render(
//   <React.StrictMode>
//     <Library />
//   </React.StrictMode>
// );

const root = ReactDOM.createRoot(document.getElementById('root'));
setInterval(() => {
  root.render(
    <React.StrictMode>
      <CommentList />
    </React.StrictMode>
  );
}, 1000);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
