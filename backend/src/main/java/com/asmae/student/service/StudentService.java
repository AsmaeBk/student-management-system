package com.asmae.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asmae.student.model.Student;
import com.asmae.student.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    // Method to get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    // Method to add a new student, we only have to check if the email is unique, we can add more validation if needed
    public Student addStudent(Student student) {
        studentRepository
        .findByEmail(student.getEmail())
        .ifPresent(s -> {
            throw new IllegalArgumentException("Student with email " + student.getEmail() + " already exists");
        });
        
        return studentRepository.save(student);
    }


    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
    }


    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId())
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + student.getId() + " not found"));
        
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setAge(student.getAge());
        
        return studentRepository.save(existingStudent);
    }


    public void deleteStudent(Integer id) {
        
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
        
        studentRepository.delete(existingStudent);
     
    }

}
