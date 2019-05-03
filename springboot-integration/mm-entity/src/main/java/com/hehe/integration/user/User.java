package com.hehe.integration.user;

import javax.persistence.*;

@Entity
@Table(name = "T_USER")
public class User {

    @Id
    @Column(name = "USERID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userId;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}
