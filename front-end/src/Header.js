import React from 'react';
import { Link } from 'react-router-dom';
import { HomeOutlined, ShoppingCartOutlined, PlusOutlined } from '@ant-design/icons';
import Icon from 'antd/lib/icon'
import './Header.css';

class Header extends React.Component {
    render(){
        return(  <header>
            <ul>
                <li><Link to='/'><HomeOutlined />商城</Link></li>
                <li><Link to='/order'><ShoppingCartOutlined />订单</Link></li>
                <li><Link to='/add'><PlusOutlined />添加商品</Link></li>
            </ul>
          </header>);
    }
}
export default Header;


