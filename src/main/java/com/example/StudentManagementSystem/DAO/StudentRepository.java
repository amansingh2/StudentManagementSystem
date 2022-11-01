package com.example.StudentManagementSystem.DAO;

import com.example.StudentManagementSystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer>{
    Student findOneByRollNumber(int rollNumber);
}
