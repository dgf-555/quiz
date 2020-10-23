import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';
import './App.css';
import Market from './conponents/market/Market';
//import Order from './conponents/order/Order'
import Add from './conponents/add_goods/Addgood';
import Header from './Header';

function App() {
  return (
    <div>
    <BrowserRouter>
    <Header></Header>
          <Switch>
            <Route exact path='/' component={Market}></Route>
            {/* <Route path='/order' component={order}></Route> */}
            <Route path='/add' component={Add}></Route>
          </Switch>
  </BrowserRouter>
   </div>

  );
}
export default App;
