package com.sideproject.ineedtodo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Member {

    @Field("id")
    String id;
    String fullName;
    String imgUrl;
    String lastSeen;


    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public String getLastSeen() {
        return lastSeen;
    }
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

   
}
