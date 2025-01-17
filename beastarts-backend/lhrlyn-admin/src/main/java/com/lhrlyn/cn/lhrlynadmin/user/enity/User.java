package com.lhrlyn.cn.lhrlynadmin.user.enity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long userid;
    @Column(name = "username")
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "about")
    private String about;
    @Column(name = "user_head_img")
    private String userHeadImg;
    @Column(name = "backageground_img")
    private String backagegroundImg;
    @Column(name = "is_void")
    private String isVoid;

}
