package com.example.StudentManagementSystem.RequestResponse;

import com.example.StudentManagementSystem.Model.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddMarksRequest {
    int rollNumber;
    HashMap<String,Integer> marks;
}
