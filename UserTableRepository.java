package com.example.intern_web_project;


import org.springframework.data.jpa.repository.JpaRepository;


/*-------------Learned------
* JpaRepository is a already built in Inteface Spring-boot provided by Spring Data JPA
* It has methods like , save(), findAll() , deleteById() and ect.
*
* JpaRepository<UserTable, Integer>
             UserTable -> is your entitiy class that was made
             * Integer -> is the type of PK*/

public interface UserTableRepository extends JpaRepository<UserTable, Integer> {




}
