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
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int facultyID;
    private String facultyName;
    private String facultyEmailID;
    @OneToMany(mappedBy="faculty")
    List<Subject> subjectTaught;

}
