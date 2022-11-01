package com.example.StudentManagementSystem.RequestResponse;


import com.example.StudentManagementSystem.Model.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    private int rollNumber;
    private  String StudentName;
    private  String studentEmailID;
    private List<String> subjectOpted;

}
