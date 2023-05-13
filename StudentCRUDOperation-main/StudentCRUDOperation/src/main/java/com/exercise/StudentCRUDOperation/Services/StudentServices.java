package com.exercise.StudentCRUDOperation.Services;

import com.exercise.StudentCRUDOperation.Model.Student;
import com.exercise.StudentCRUDOperation.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    StudentRepository repository;
    public List<Student> displayStudents(){
        List<Student> studentList=repository.findAll();
        return studentList;
    }
    public void addStudent(Student s){repository.save(s);}
    public void updateStudent(Student s){repository.save(s);}
    public void deleteStudent(int id){repository.deleteById(id);}

}
