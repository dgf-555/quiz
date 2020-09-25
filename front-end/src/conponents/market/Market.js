import React from 'react';
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
      render() {
        return (
          <div>
            {this.state.goods.map((good) => (
              <div className="good" key="good.name">
                <Good array={good} />
              </div>
            ))}
          </div>
        );
      }

}
export default Market;