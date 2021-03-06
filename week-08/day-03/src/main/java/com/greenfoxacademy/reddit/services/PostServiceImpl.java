package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> returnAllPostsDescByVotes() {
    List<Post> posts = new ArrayList<>();
    /*postRepository.findAll()
        .forEach(posts::add);
    return posts;*/
    postRepository.getAllPostsByDescendingByVotes().forEach(posts::add);
    return posts;
  }

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void changeVote(String vote, Long id) {
    Optional<Post> updatedPost = postRepository.findById(id);
    if (updatedPost.isPresent()) {
      Post post = updatedPost.get();
      if (vote.equals("+")) {
        post.setVotes(post.getVotes()+1);
      } else if (vote.equals("-")) {
        post.setVotes(post.getVotes()-1);
      }
      postRepository.save(post);
    }
  }


}
