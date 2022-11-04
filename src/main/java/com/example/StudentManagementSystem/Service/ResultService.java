package com.example.StudentManagementSystem.Service;
import com.example.StudentManagementSystem.DAO.ResultRepository;
import com.example.StudentManagementSystem.Model.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultService {
    private ResultRepository resultRepository;

    public List<Result> getResult(){
        return resultRepository.findAll();
    }

    public void addResult(double percentage){
        Result result = new Result();
        if(percentage >= 33.0){
            result.setStatus("Pass");
        }else{
            result.setStatus("Fail");
        }
        resultRepository.save(result);
    }
}
