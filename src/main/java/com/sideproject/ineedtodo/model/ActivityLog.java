package com.sideproject.ineedtodo.model;

public class ActivityLog {

    String id;
    String createdAt;
    MinUser byUser;
    String desc;
    Task taks;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public MinUser getByUser() {
        return byUser;
    }
    public void setByUser(MinUser byUser) {
        this.byUser = byUser;
    }
    public String getDescription() {
        return desc;
    }
    public void setDescription(String desc) {
        this.desc = desc;
    }
    public Task getTaks() {
        return taks;
    }
    public void setTaks(Task taks) {
        this.taks = taks;
    }


}
