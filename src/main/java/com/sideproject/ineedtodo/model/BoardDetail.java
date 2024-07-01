package com.sideproject.ineedtodo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Board")
public class BoardDetail {

    @Id
    String id;
    MinUser boardCreator;
    String name;
    String createdAt;
    String description;
    List<Member> members;
    List<Group> groups;
    List<Task> tasks;
    List<ActivityLog> activityLog; 

    
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public MinUser getBoardCreator() {
        return boardCreator;
    }
    public void setBoardCreator(MinUser boardCreator) {
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
    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
    public List<Group> getGroup() {
        return groups;
    }
    public void setGroup(List<Group> groups) {
        this.groups = groups;
    }
    public List<ActivityLog> getActivityLog() {
        return activityLog;
    }
    public void setActivityLog(List<ActivityLog> activityLog) {
        this.activityLog = activityLog;
    }
    public String get_id() {
        return id;
    }
    public void set_id(String id) {
        this.id = id;
    }

}
