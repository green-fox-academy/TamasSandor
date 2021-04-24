package com.tom.week03.day03;

import java.util.ArrayList;

public class Blog {
  private ArrayList<BlogPost> blogs;

  public Blog() {
    blogs = new ArrayList<>();
  }

  public void add(BlogPost blogPost) {
    blogs.add(blogPost);
  }

  public void delete(int index) {
    blogs.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    blogs.set(index, blogPost);
  }
}
