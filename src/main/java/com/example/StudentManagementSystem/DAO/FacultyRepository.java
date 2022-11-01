package com.example.StudentManagementSystem.DAO;

import com.example.StudentManagementSystem.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

}
