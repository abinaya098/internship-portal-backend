package com.abinaya.internshipportal.repository;

import com.abinaya.internshipportal.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Integer> {

}