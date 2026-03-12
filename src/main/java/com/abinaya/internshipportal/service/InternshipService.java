package com.abinaya.internshipportal.service;

import com.abinaya.internshipportal.model.Internship;
import com.abinaya.internshipportal.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipService {

    @Autowired
    private InternshipRepository internshipRepository;

    // Create / Save internship
    public Internship saveInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    // Get all internships
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    // Get internship by id
    public Optional<Internship> getInternshipById(int id) {
        return internshipRepository.findById(id);
    }

    // Update internship
    public Internship updateInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    // Delete internship
    public void deleteInternship(int id) {
        internshipRepository.deleteById(id);
    }
}