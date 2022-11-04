package com.example.StudentManagementSystem.Service;

import com.example.StudentManagementSystem.DAO.FacultyRepository;
import com.example.StudentManagementSystem.DAO.ResultRepository;
import com.example.StudentManagementSystem.DAO.StudentRepository;
import com.example.StudentManagementSystem.DAO.SubjectRepository;
import com.example.StudentManagementSystem.Model.Faculty;
import com.example.StudentManagementSystem.Model.Result;
import com.example.StudentManagementSystem.Model.Student;
import com.example.StudentManagementSystem.Model.Subject;
import com.example.StudentManagementSystem.RequestResponse.AddMarksRequest;
import com.example.StudentManagementSystem.RequestResponse.FacultyRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FacultyService {
    private FacultyRepository facultyRepository;
    private SubjectRepository subjectRepository;
    private StudentRepository studentRepository;
    private ResultService resultService;

    public List<Faculty> getFaculty(){
        return facultyRepository.findAll();
    }
    public String addFaculty(FacultyRequest facultyRequest){
        Faculty faculty = new Faculty();
        faculty.setFacultyName(facultyRequest.getFacultyName());
        faculty.setFacultyEmailID(facultyRequest.getFacultyEmailID());
        List<Subject> subjects = new ArrayList<>();
        for(String s : facultyRequest.getSubjectTaught()){
            Subject subject = subjectRepository.findOneBySubjectName(s);
            if(subject == null){
                subject = new Subject();
                subject.setSubjectName(s);
                subjectRepository.save(subject);
            }
            subjects.add(subject);
        }
        faculty.setSubjectTaught(subjects);
        facultyRepository.save(faculty);
        return "Student" + faculty.getFacultyName() + "added";
    }
    public String addMarks(AddMarksRequest addMarksRequest){
        Student student = studentRepository.findOneByRollNumber(addMarksRequest.getRollNumber());
        if(student != null){
            student.setMarks(addMarksRequest.getMarks());
            studentRepository.save(student);
            int totalSubject = 0;
            int totalMarks = 0;
            for(String s : student.getMarks().keySet()){
                totalMarks += student.getMarks().get(s);
                totalSubject++;
            }
            double percentage = totalMarks/totalSubject;
            resultService.addResult(percentage);
            return "Marks Added";
        }
        return "Student not present";
    }

    public String deleteFaculty(int facultyId){
        Faculty faculty = facultyRepository.findById(facultyId).orElse(null);
        if(faculty == null){
            return "" + "faculty not present";
        }else{
            facultyRepository.deleteById(faculty.getFacultyID());
        }
        return "" + "deletion successful" ;
    }
}