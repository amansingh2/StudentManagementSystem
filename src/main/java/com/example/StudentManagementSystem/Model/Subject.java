package com.example.StudentManagementSystem.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subjectID;
    @ManyToOne
    @JoinColumn(name="rollNumber", nullable=false)
    private Student student;
    @ManyToOne
    @JoinColumn(name="facultyId", nullable=false)
    private Faculty faculty;
    private  String subjectName;
}
