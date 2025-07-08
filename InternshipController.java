package com.example.intern_web_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* It will handle CRUD operations for internships:
POST /internships → Add a new internship
GET /internships → Get all internships
GET /internships/{id} → Get one
PUT /internships/{id} → Update
DELETE /internships/{id} → Delete*/

@RestController
public class InternshipController {

    private final InternshipRepository internshipRepository;

    @Autowired  // understand what autowire is again
    public InternshipController(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    @PostMapping("/Intern")
    public Internship postIntern(@RequestBody Internship info) {
        return internshipRepository.save(info);

    }

    @GetMapping("/Intern")
    public List<Internship> all_intern() {
        return internshipRepository.findAll();
    }

    @GetMapping("/internship/{id}")
    public Internship getInternshipById(@PathVariable int id) {
        return internshipRepository.findById(id).orElse(null);
    }

    @PutMapping("/internships/{id}")
    public Internship updateInternship(@PathVariable int id, @RequestBody Internship updatedIntern) {
        return internshipRepository.findById(id)
                .map(intern -> {
                    intern.setTitle(updatedIntern.getTitle());
                    intern.setCompany(updatedIntern.getCompany());
                    intern.setRequiredSkills(updatedIntern.getRequiredSkills());
                    intern.setLocation(updatedIntern.getLocation());
                    return internshipRepository.save(intern);
                })
                .orElse(null); 
    }

    @DeleteMapping("/internships/{id}")
    public String deleteInternship(@PathVariable int id) {
        if (internshipRepository.existsById(id)) {
            internshipRepository.deleteById(id);
            return "Internship with ID " + id + " has been deleted.";
        } else {
            return "Internship with ID " + id + " not found.";
        }
    }

    @GetMapping("/match")
    public List<Internship> matchInternships(@RequestParam String skills, @RequestParam String location) {
        return internshipRepository.findByRequiredSkillsContainingAndLocation(skills, location);
    }



}
