package com.greenfoxacademy.reddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private String url;
  private int votes;
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;

  public Post() {
    this.date = new Date();
    this.votes = 0;
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.date = new Date();
    this.votes = 0;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
