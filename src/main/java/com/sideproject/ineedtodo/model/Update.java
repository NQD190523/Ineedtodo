package com.sideproject.ineedtodo.model;

import java.util.List;

public class Update {

    String id;
    Long  createdAt;
    String txt;
    String imgUrl;
    List<Reply> replies;
    NoteMember member;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
    public String getTxt() {
        return txt;
    }
    public void setTxt(String txt) {
        this.txt = txt;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public List<Reply> getReplies() {
        return replies;
    }
    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }
    public NoteMember getMember() {
        return member;
    }
    public void setMember(NoteMember member) {
        this.member = member;
    }

}

