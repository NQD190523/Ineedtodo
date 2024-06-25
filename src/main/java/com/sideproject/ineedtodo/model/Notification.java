package com.sideproject.ineedtodo.model;

public class Notification {

    MinUser byUser;
    String content;
    String createdAt;

    
    public MinUser getByUser() {
        return byUser;
    }
    public void setByUser(MinUser byUser) {
        this.byUser = byUser;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    
}
