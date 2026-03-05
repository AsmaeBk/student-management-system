package com.asmae.student.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asmae.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByEmail(String email);
    
}
