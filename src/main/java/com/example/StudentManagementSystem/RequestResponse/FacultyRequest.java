package com.example.StudentManagementSystem.RequestResponse;
import com.example.StudentManagementSystem.Model.Faculty;
import com.example.StudentManagementSystem.Model.Subject;
import lombok.*;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacultyRequest {
    private int facultyID;
    private String facultyName;
    private String facultyEmailID;
    List<String> subjectTaught;

    public FacultyRequest(Faculty faculty) {
    }
}
