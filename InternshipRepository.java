package com.example.intern_web_project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InternshipRepository extends JpaRepository<Internship,Integer> {


    List<Internship> findByRequiredSkillsContainingAndLocation(String skill, String location);


}
