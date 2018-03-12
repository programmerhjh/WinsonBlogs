package com.blog.winson.repository;

import com.blog.winson.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 洪家豪
 *         Created by acer on 2018/3/12.
 */
public interface PostRepository extends JpaRepository<Post,Long> {

    void insertOne(Post post);
}
