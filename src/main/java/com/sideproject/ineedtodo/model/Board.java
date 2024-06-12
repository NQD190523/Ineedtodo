package com.sideproject.ineedtodo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Board")
public class Board {

    User boardCreator;
    String name;
    String createdAt;
    String description;
    List<User> members;
    List<Group> group;
    String activityLog;

    
    public User getBoardCreator() {
        return boardCreator;
    }
    public void setBoardCreator(User boardCreator) {
        this.boardCreator = boardCreator;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<User> getMembers() {
        return members;
    }
    public void setMembers(List<User> members) {
        this.members = members;
    }
    public List<Group> getGroup() {
        return group;
    }
    public void setGroup(List<Group> group) {
        this.group = group;
    }
    public String getActivityLog() {
        return activityLog;
    }
    public void setActivityLog(String activityLog) {
        this.activityLog = activityLog;
    }

}
