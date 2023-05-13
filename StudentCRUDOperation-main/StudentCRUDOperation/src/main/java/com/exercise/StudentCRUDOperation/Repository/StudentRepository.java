package com.exercise.StudentCRUDOperation.Repository;

import com.exercise.StudentCRUDOperation.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
