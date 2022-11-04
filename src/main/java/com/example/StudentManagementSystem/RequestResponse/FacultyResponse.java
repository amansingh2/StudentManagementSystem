package com.example.StudentManagementSystem.RequestResponse;

import com.example.StudentManagementSystem.Model.Faculty;
import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Model.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class FacultyResponse {
    private int facultyID;
    private String facultyName;
    private String facultyEmailID;
    List<String> subjectTaught;

    public FacultyResponse(Faculty faculty) {
        this.facultyID = faculty.getFacultyID();
        this.facultyName = faculty.getFacultyName();
        this.facultyEmailID = faculty.getFacultyEmailID();
        this.subjectTaught= faculty.getSubjectTaught().stream().map(subject  -> subject.getSubjectName()).collect(Collectors.toList());
    }

}
