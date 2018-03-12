package com.blog.winson.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 洪家豪
 *         Created by acer on 2018/3/12.
 *         文章实体
 */
@Entity
@Table(name = "post")
public class Post {

    @NotBlank
    @Column
    private String head;

    @NotBlank
    @Column
    private String content;

    @NotNull
    @Column
    private long pushTime;

    @NotNull
    @Column
    private String author;

    @Id
    @Column(name = "pid")
    @GeneratedValue
    @NotNull
    private long pid;

    @Column
    private String classify;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getPushTime() {
        return pushTime;
    }

    public void setPushTime(long pushTime) {
        this.pushTime = pushTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }
}
