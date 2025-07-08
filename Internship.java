package com.example.intern_web_project;

import jakarta.persistence.*;


@Entity
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String company;

    private String requiredSkills;
    private String location;

public Internship(){}

    public Internship(int id , String title , String company , String required_skills , String location){
    this.id = id;
    this.title = title;
    this.company = company;
    this.requiredSkills = requiredSkills;
    this.location = location;
    }

    // setters
    public void setId(int id){
    this.id = id;
    }
    public void setTitle(String title){
    this.title = title;
    }
    public void setCompany(String company){
    this.company = company;
    }
    public void setRequiredSkills(String requiredSkills){
    this.requiredSkills = requiredSkills;
    }
    public void setLocation(String location){
    this.location = location;
    }
    // getters
    public int getId(){
    return this.id;
    }
    public String getTitle(){
    return this.title;
    }
    public String getCompany(){
    return this.company;
    }
    public String getRequiredSkills(){
    return this.requiredSkills;
    }
    public String getLocation(){
    return this.location;
    }

    public String toString(){
    return "Id:"+this.id+ ", Title:"+this.title + ", Company:"+this.company+", Required Skills:"+this.requiredSkills + ", Location:"+this.location;
    }

}
