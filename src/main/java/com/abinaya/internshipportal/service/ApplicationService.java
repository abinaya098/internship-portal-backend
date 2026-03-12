package com.abinaya.internshipportal.service;

import com.abinaya.internshipportal.model.Application;
import com.abinaya.internshipportal.repository.ApplicationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository repository;

    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public List<Application> getAllApplications() {
        return repository.findAll();
    }

    public Application getApplicationById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Application createApplication(Application app) {
        return repository.save(app);
    }

    public Application updateApplication(Long id, Application app) {
        if (repository.existsById(id)) {
            app.setId(id);
            return repository.save(app);
        }
        return null;
    }

    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }
}