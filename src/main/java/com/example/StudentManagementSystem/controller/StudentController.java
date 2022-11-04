package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.RequestResponse.StudentRequest;
import com.example.StudentManagementSystem.RequestResponse.StudentResponse;
import com.example.StudentManagementSystem.Service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;
    @GetMapping("/")
//    public ResponseEntity<List<StudentRequest>> getStudents() {
//        List<StudentRequest> studentList = studentService.getStudents().stream().map(StudentRequest :: new).collect(Collectors.toList());
//        if (studentList != null || studentList.size() > 0) {
//            return ResponseEntity.of(Optional.of(studentList));
//        }
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//
//    }
    public List<StudentResponse> getStudents() {
        List<Student> s = studentService.getStudents();
        System.out.println(s.get(0).getStudentName());
        List<StudentResponse> studentList = studentService.getStudents().stream().map(StudentResponse:: new).collect(Collectors.toList());
        System.out.println(studentList.get(0).getStudentName());
        return studentList;

    }

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequest studentRequest){
        System.out.println(studentRequest.getSubjectOpted());
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
