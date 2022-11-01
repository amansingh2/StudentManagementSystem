package com.example.StudentManagementSystem.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int resultID;
    @OneToOne
    @JoinColumn(name = "student_roll_number")
    private Student student;
    private String status;


}
