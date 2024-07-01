package com.sideproject.ineedtodo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class Task {

    @Field("id")
    String id;
    String name;
    String date;
    List<MinUser> members;
    String status;
    String priority;
    String duaDate;
    List<String> updates;
    String lastUpdated;
    boolean isSelected;
    List<Post> posts;
    List<String> tags;
    List<String> attachedImgs;

    
    public List<String> getAttachedImgs() {
        return attachedImgs;
    }
    public void setAttachedImgs(List<String> attachedImgs) {
        this.attachedImgs = attachedImgs;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public List<MinUser> getMembers() {
        return members;
    }
    public void setMembers(List<MinUser> members) {
        this.members = members;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getDuaDate() {
        return duaDate;
    }
    public void setDuaDate(String duaDate) {
        this.duaDate = duaDate;
    }
    public List<String> getUpdates() {
        return updates;
    }
    public void setUpdates(List<String> updates) {
        this.updates = updates;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public boolean isSelected() {
        return isSelected;
    }
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    public List<Post> getPosts() {
        return posts;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    
}
