package com.asmae.student.controller;

import org.springframework.web.bind.annotation.RestController;

import com.asmae.student.model.Student;
import com.asmae.student.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
    
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public Student postMethodName(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student putMethodName(@PathVariable Integer id, @RequestBody Student student) {
        student.setId(id);
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteMethodName(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }
    
}
