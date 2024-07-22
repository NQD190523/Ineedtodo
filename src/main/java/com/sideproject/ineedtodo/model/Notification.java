package com.sideproject.ineedtodo.model;

public class Notification {

    MinUser byUser;
    Boolean isRead;
    String content;
    String createdAt;

    
    public Boolean getIsRead() {
        return isRead;
    }
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }
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
