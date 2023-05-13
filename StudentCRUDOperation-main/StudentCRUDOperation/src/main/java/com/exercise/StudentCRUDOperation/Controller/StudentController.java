package com.exercise.StudentCRUDOperation.Controller;

import com.exercise.StudentCRUDOperation.Model.Student;
import com.exercise.StudentCRUDOperation.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices services;
    @GetMapping("/stude")
    public List<Student> displayStudents(){
        return services.displayStudents();
    }
    @PostMapping("/stude")
    public void add(@RequestBody Student s){services.addStudent(s);}
    @PutMapping("/stude")
    public void update(@RequestBody Student s){services.updateStudent(s);}
    @DeleteMapping("/stude/{sid}")
    public void delete(@PathVariable int sid){services.deleteStudent(sid);}
}
