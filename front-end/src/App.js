import React from 'react';
import { BrowserRouter, Switch, Route, Link} from 'react-router-dom';
import './App.css';
import Market from './conponents/market/Market';
//import Order from './conponents/order/Order'


function App() {
  return (
    <BrowserRouter>
        <div className="App">
        Hello ! Welcome to my shop
          <ul>
          <li>
              <Link to='/'>商城</Link>
            </li>
            <li>
              <Link to='/order'>订单</Link>
            </li>
          </ul>
          
          <Switch>
            <Route exact path='/' component={Market}></Route>
            {/* <Route path='/order' component={Market}></Route>
            <Route path='/' component={Market}></Route> */}
          </Switch>

</div></BrowserRouter>

  );
}

export default App;
