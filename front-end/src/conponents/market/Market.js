import React from 'react';
import { ShoppingCartOutlined } from '@ant-design/icons';
import './Market.css';
import Good from './Good';
class Market extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
          goods: new Array(),
        };
      }
      componentDidMount() {
        async function fetchData(url) {
          const response = await fetch(url, {
            method: 'GET',
            headers: myHeaders,
            mode: 'cors',
            //转字符串格式
          });
          const result = await response.json();
          console.log(result);
          return result;
        }
        //修改请求头
        let myHeaders = new Headers({
          'Access-Control-Allow-Origin': '*',
          'Content-Type': 'text/plain',
        });
        const URL = 'http://localhost:8080/goods';
        fetchData(URL)
          .then((result) => this.setState({ goods: result }))
          .catch((error) => console.log(error));
      }

      handleClickAddProduct = name => () => {
        this.setState({
          clicknum: this.state.clicknum + 1,
        });
      };
      handleclickShoppingCart() {

      }

      render() {
        return (
          <div>
          <div className="good">
            {this.state.goods.map((good) => (
              <div key="good.name">
                <Good array={good} addProduct={this.handleClickAddProduct} />
              </div>
            ))}
          </div>
          <ShoppingCartOutlined onClick={this.handleclickShoppingCart}/>
          </div>
        );
      }

}
export default Market;