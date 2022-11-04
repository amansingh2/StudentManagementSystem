package com.example.StudentManagementSystem.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNumber;
    private  String StudentName;
    private  String studentEmailID;
    @OneToMany(mappedBy = "student")
    private List<Subject> subjectOpted;
    private HashMap<String,Integer>marks = new HashMap<>();
    @OneToOne
    private Result result;



}
