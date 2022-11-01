package com.example.StudentManagementSystem.DAO;

import com.example.StudentManagementSystem.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result,Integer> {

}
