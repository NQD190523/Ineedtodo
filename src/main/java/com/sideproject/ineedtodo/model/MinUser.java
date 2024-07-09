package com.sideproject.ineedtodo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class MinUser {

    @Field("id")
    String id;
    String fullName;
    String imgUrl;
    String email;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String get_id() {
        return id;
    }
    public void set_id(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
