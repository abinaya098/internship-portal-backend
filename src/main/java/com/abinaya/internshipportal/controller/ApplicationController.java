package com.abinaya.internshipportal.controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.abinaya.internshipportal.model.Application;
import com.abinaya.internshipportal.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Application> getAll() {
        return service.getAllApplications();
    }

    @GetMapping("/{id}")
    public Application getById(@PathVariable Long id) {
        return service.getApplicationById(id);
    }

    @PostMapping
    public Application create(@RequestBody Application app) {
        return service.createApplication(app);
    }

    @PutMapping("/{id}")
    public Application update(@PathVariable Long id, @RequestBody Application app) {
        return service.updateApplication(id, app);
    }

    @DeleteMapping("/{id}")
    public String deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
        return "Application deleted successfully";
    }
}