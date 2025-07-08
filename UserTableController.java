package com.example.intern_web_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Struggle here ----
@RestController
public class UserTableController {
 // Why add this?
    private final UserTableRepository userTableRepository;


// what is autowire again? and whene need to use it
   @Autowired
   // Why create a method?
    public UserTableController(UserTableRepository userTableRepository) {
        this.userTableRepository = userTableRepository;
    }

    @PostMapping("/")
    public UserTable newUser(@RequestBody UserTable user){
        return userTableRepository.save(user);

    }

    @GetMapping("/")
    public List<UserTable> getAllUsers(){
       return userTableRepository.findAll();

    }

    @PutMapping("/{id}")
    public UserTable updateUser(@PathVariable int id, @RequestBody UserTable updatedUser) {
        return userTableRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setSkills(updatedUser.getSkills());
                    user.setLocation(updatedUser.getLocation());
                    return userTableRepository.save(user);
                })
                .orElse(null); // or throw a custom NotFoundException if preferred
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        if (userTableRepository.existsById(id)) {
            userTableRepository.deleteById(id);
            return "User with ID " + id + " has been deleted.";
        } else {
            return "User with ID " + id + " not found.";
        }
    }





}
