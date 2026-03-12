package com.abinaya.internshipportal.controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abinaya.internshipportal.model.Internship;
import com.abinaya.internshipportal.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/internships")
public class InternshipController {

    @Autowired
    private InternshipService internshipService;

    // GET all internships
    @GetMapping
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }

    // GET internship by id
    @GetMapping("/{id}")
    public Optional<Internship> getInternshipById(@PathVariable int id) {
        return internshipService.getInternshipById(id);
    }

    // POST new internship
    @PostMapping
    public Internship createInternship(@RequestBody Internship internship) {
        return internshipService.saveInternship(internship);
    }

    // PUT update internship
    @PutMapping("/{id}")
    public Internship updateInternship(@PathVariable int id, @RequestBody Internship internship) {
        internship.setId(id);
        return internshipService.updateInternship(internship);
    }

    // DELETE internship
    @DeleteMapping("/{id}")
    public String deleteInternship(@PathVariable int id) {
        internshipService.deleteInternship(id);
        return "Internship deleted successfully!";
    }
}