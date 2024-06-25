package com.sideproject.ineedtodo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Board")
public class BoardDetail {

    String _id;
    User boardCreator;
    String name;
    String createdAt;
    String description;
    List<Member> members;
    List<Group> group;
    List<Task> tasks;
    ActivityLog activityLog; 

    
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
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
    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
    public List<Group> getGroup() {
        return group;
    }
    public void setGroup(List<Group> group) {
        this.group = group;
    }
    public ActivityLog getActivityLog() {
        return activityLog;
    }
    public void setActivityLog(ActivityLog activityLog) {
        this.activityLog = activityLog;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }


    public class Member {
        MinUser member;
        String lastSeen;

        public MinUser getMember() {
            return member;
        }
        public void setMember(MinUser member) {
            this.member = member;
        }
        public String getLastSeen() {
            return lastSeen;
        }
        public void setLastSeen(String lastSeen) {
            this.lastSeen = lastSeen;
        }
    
    }

}
