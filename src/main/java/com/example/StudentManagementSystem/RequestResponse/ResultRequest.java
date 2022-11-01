package com.example.StudentManagementSystem.RequestResponse;

import com.example.StudentManagementSystem.Model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultRequest {
    private int resultID;
    private Student student;
    private String status;

}
