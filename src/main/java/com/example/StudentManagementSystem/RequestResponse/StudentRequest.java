package com.example.StudentManagementSystem.RequestResponse;


import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Model.Subject;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private int rollNumber;
    private  String StudentName;
    private  String studentEmailID;
    private List<String> subjectOpted;

//    public StudentRequest(Student student) {
//        this.rollNumber = student.getRollNumber();
//        this.StudentName = student.getStudentName();
//        this.studentEmailID = student.getStudentEmailID();
//        this.subjectOpted = new ArrayList<String>(student.getSubjectOpted());

//    }
}
