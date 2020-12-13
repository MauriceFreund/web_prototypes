import React, { Component } from 'react';

class UserInfo extends Component {

  constructor(props) {
    super(props);
    this.state = {
      name: "",
      id: ""
    };
  }

  componentDidMount() {
    this.props.keycloak.loadUserInfo().then(userInfo => {
        console.log(userInfo);
        this.setState({name: userInfo.preferred_username, id: userInfo.sub})
    });
  }

  render() {
    return (
      <div className="UserInfo">
        <p>Name: {this.state.name}</p>
        <p>ID: {this.state.id}</p>
      </div>
    );
  }
}
export default UserInfo;