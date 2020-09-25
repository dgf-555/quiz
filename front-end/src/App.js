import React from 'react';
import { BrowserRouter, Switch, Route, Link} from 'react-router-dom';
import './App.css';
import Market from './conponents/market/Market';
//import Order from './conponents/order/Order'
import Add from './conponents/add_goods/Addgood';


function App() {
  return (
    <BrowserRouter>
        <div className="App">
        Hello ! Welcome to my shop
          <ul className='link'>
          <li>
              <Link to='/'>商城</Link>
            </li>
            <li>
              <Link to='/order'>订单</Link>
            </li>
            <li>
              <Link to='/add'>添加商品</Link>
            </li>
          </ul>
          
          <Switch>
            <Route exact path='/' component={Market}></Route>
            {/* <Route path='/order' component={order}></Route> */}
            <Route path='/add' component={Add}></Route>
          </Switch>

</div></BrowserRouter>

  );
}

export default App;
