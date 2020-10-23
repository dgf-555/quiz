import React from 'react';
import {Button} from 'antd'
import './Good.css';


class Order extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      price: '20元/瓶',
      name: '可乐1',
    };
  }
  render() {
    return (
      <div className="good">
        <img src={this.props.array.url} alt={this.props.array.name} />
        <h3>{this.props.array.name}</h3>
        <p>单价：{this.props.array.price}{this.props.array.priceUnit}</p>
        <Button onClick={this.props.addProduct(this.props.array.name)}>+</Button>
          {/* <Button onClick={this.handleclick} /> */}
      </div>
    );
  }
}
export default Order;