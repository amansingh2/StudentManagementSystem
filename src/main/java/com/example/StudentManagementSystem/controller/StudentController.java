package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.RequestResponse.StudentRequest;
import com.example.StudentManagementSystem.Service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequest studentRequest){
        return studentService.addStudent(studentRequest);
    }

    /*
    @PutMapping("/edit/{id}")
    public String edit
     */;

     @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
