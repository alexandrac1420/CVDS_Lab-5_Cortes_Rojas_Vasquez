package com.app.api;

public class User {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Boolean isCompleted(){
        return completed;
    }

    public void setCompletion(Boolean completed){
        this.completed = completed;
    }
    
}