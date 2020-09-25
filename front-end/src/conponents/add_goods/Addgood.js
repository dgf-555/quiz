import React, {Component} from 'react';
class Add extends Component {
    constructor(props){
      super(props);
      this.state = {
        name: '',
        price:'',
        danwei:'',
        url:'',
      };
      console.log('执行了constructor')
      this.handleChange = this.handleChange.bind(this); 
    }
    handleChange=(event)=>{
      this.setState({
        [event.target.name]:event.target.value,
      })
    }
    handlepriceChange=(event)=>{
        this.setState({
          [event.target.name]:event.target.value,
        })
      }
    handlesubmit =(event)=>{
      event.preventDefault();
    }
    render() {
      return (
        <form className='from' onSubmit={this.handlesubmit}>
          <p className='addgood'>添加商品</p>
          <span>*名称</span>
          <br/>
          <input 
          className="nameform" 
          type='text'
          name ='name' 
          value={this.state.name} 
          onChange={this.handleChange}
          />     
          <br/>
          <span>*价格</span>
          <br/>
          <input 
          className="nameform" 
          type='text'
          name ='price' 
          value={this.state.price} 
          onChange={this.handleChange}
          />     
          <br/>
          <span>*单位</span>
          <br/>
          <input 
          className="form" 
          type='text'
          name ='danwei' 
          value={this.state.danwei} 
          onChange={this.handleChange}
          />     
          <br/>
          <br/>
          <span>*图片</span>
          <br/>
          <input 
          className="form" 
          type='text'
          name ='url' 
          value={this.state.url} 
          onChange={this.handleChange}
          />     
          <br/>
          <input 
          className="submit" 
          type="submit" 
          value="Submit"
          disabled= {
            this.state.name===""||
            this.state.price===""||
            this.state.danwei===""||
            this.state.url===""
          }
          />
        </form>
      );
    }
  }
  
  export default Add;
  