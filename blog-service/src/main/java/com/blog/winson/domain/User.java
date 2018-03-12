package com.blog.winson.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 洪家豪
 *         Created by acer on 2018/3/12.
 *         用户实体
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @NotNull
    @Column(name = "uid")
    private long uid;

    @Column
    @NotBlank
    private String username;

    @Column
    @NotBlank
    private String password;

    @Column
    private String email;

    @Column
    private String job;

    @Column
    private String location;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
