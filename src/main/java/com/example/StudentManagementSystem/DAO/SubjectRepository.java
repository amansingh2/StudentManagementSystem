package com.example.StudentManagementSystem.DAO;

import com.example.StudentManagementSystem.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository <Subject,Integer> {
    Subject findOneBySubjectName(String subjectName);
}
