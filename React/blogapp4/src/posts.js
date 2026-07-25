import React from "react";
import Post from "./Post";

class Posts extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        const posts = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );

        this.setState({
          posts: posts
        });
      })
      .catch((error) => {
        alert("Unable to load posts: " + error.message);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>

        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
    console.log(info);
  }
}

export default Posts;