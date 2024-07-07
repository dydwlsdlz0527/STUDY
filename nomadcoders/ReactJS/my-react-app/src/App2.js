import React from 'react';
import Header from './page/Header';
import Footer from './page/Footer';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './page/HomePage';
import LoginPage from './page/LoginPage';

const App2 = () => {
    return (
        <div>
            <Router>
          <Header/>
            <Routes>
                <Route path="/" exact={true} element={<HomePage/>}/>
                <Route path="/login/:id" exact={true} element={<LoginPage/>}/>
            </Routes>
          <Footer/>
          </Router>
        </div>
    );
};

export default App2;