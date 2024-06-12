package com.sideproject.ineedtodo.model;

import java.util.List;

public class Group {
    String id;
    String name;
    String createdAt;
    String color;
    String lastUpdated;
    Boolean tagsShown;
    List<Tag> tags;
    List<Task> tasks;
    
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
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public Boolean getTagsShown() {
        return tagsShown;
    }
    public void setTagsShown(Boolean tagsShown) {
        this.tagsShown = tagsShown;
    }
    public List<Tag> getTags() {
        return tags;
    }
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}
