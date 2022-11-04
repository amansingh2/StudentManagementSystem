package com.example.StudentManagementSystem.Service;
import com.example.StudentManagementSystem.DAO.StudentRepository;
import com.example.StudentManagementSystem.DAO.SubjectRepository;
import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Model.Subject;
import com.example.StudentManagementSystem.RequestResponse.StudentRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;
    public List<Student> getStudents(){ return studentRepository.findAll(); }

    public String addStudent(StudentRequest studentRequest){
        Student student = new Student();
        student.setStudentName(studentRequest.getStudentName());
        student.setStudentEmailID(studentRequest.getStudentEmailID());
        List<Subject> subjects = new ArrayList<>();
        for(String s : studentRequest.getSubjectOpted()){
            Subject subject = subjectRepository.findOneBySubjectName(s);
            if(subject == null){
                subject = new Subject();
                subject.setSubjectName(s);
                subjectRepository.save(subject);
            }
            subjects.add(subject);
        }
        student.setSubjectOpted(subjects);
        studentRepository.save(student);
        return "Student" + student.getStudentName() + "added";
    }
    /*
    public String updateStudentDetails(int rollNumber,StudentRequest studentRequest){
        Student student = studentRepository.findOneByRollNumber(rollNumber);
        if(student == null){
            return "" + "student not present";
        }else{
            studentRepository.deleteById(rollNumber);
            studentRequest.setRollNumber(rollNumber);
            addStudent(studentRequest);
        }
        return "";
    }
     */

    public String deleteStudent(int rollNumber){
        Student student = studentRepository.findOneByRollNumber(rollNumber);
        if(student == null){
            return "" + "student not present";
        }else{
            studentRepository.deleteById(rollNumber);
        }
        return "" + "deletion successfull" ;
    }


}
