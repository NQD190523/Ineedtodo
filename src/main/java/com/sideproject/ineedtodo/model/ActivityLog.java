package com.sideproject.ineedtodo.model;

public class ActivityLog {

    String createdAt;
    MinUser byUser;
    String description;
    Task taks;

    
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
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Task getTaks() {
        return taks;
    }
    public void setTaks(Task taks) {
        this.taks = taks;
    }


}
