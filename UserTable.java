package com.example.intern_web_project;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
* create table user_table(
id int primary key auto_increment,
name varchar(100),
skills text,
location text);*/
@Entity
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String skills;
    private String location;

    public UserTable(){}

    public UserTable(int id , String name , String skills , String location){
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.location = location;
    }

    // setters
  public void setId(int id){
        this.id = id;
  }
  public void setName(String name){
        this.name = name;
  }
  public void setSkills(String skills){
        this.skills = skills;
  }
  public void setLocation(String location){
        this.location = location;
  }


  // getters

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getSkills(){
        return skills;
    }
    public String getLocation(){
        return this.location;
    }

    // String method

    public String toString(){
        return "ID:"+getId()+", Name:"+getName()+ ", Skills:"+getSkills()+ ", Location:"+getLocation();
    }
}

