package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.Model.Faculty;
import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.RequestResponse.FacultyRequest;
import com.example.StudentManagementSystem.RequestResponse.FacultyResponse;
import com.example.StudentManagementSystem.RequestResponse.StudentRequest;
import com.example.StudentManagementSystem.Service.FacultyService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/faculty")
public class FacultyController {
    private FacultyService facultyService;

    @GetMapping("/")
    public List<FacultyResponse> getStudents() {
        List<Faculty> f = facultyService.getFaculty();
        List<FacultyResponse> facultyList = facultyService.getFaculty().stream().map(FacultyResponse::new).collect(Collectors.toList());
        return facultyList;
    }

    @PostMapping("/add")
    public String addFaculty(@RequestBody FacultyRequest facultyRequest){
        return facultyService.addFaculty(facultyRequest);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return facultyService.deleteFaculty(id);
    }


}
