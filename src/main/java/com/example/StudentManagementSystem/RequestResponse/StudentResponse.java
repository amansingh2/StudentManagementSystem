package com.example.StudentManagementSystem.RequestResponse;

import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Model.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class StudentResponse {
    private int rollNumber;
    private  String StudentName;
    private  String studentEmailID;
    private List<String> subjectOpted;

    public StudentResponse(Student student) {
        this.rollNumber = student.getRollNumber();
        this.StudentName = student.getStudentName();
        this.studentEmailID = student.getStudentEmailID();
        this.subjectOpted = student.getSubjectOpted().stream().map(subject -> subject.getSubjectName()).collect(Collectors.toList());
    }

}
