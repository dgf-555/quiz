import React from 'react';
import './Good.css';
import imgURL from '../../assets/product_image_placeholder.png';
class Good extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      price: '20元/瓶',
      name: '可乐1',
      clicknum: 0,
    };
  }
  handleclick = () => {
    this.setState({
      clicknum: this.state.clicknum + 1,
    });
  };
  render() {
    return (
      <div className="good">
        <h3>{this.props.array.name}</h3>
        <img src={imgURL} />
        <div className="price_button">
          <p>{this.props.array.price}</p>
          {/* <Button className="button">add to cart</Button> */}
          <button className="button" onClick={this.handleclick}>
            ＋
          </button>
        </div>
      </div>
    );
  }
}
export default Good;
