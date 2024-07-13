package com.example.awsdb.learn.awslearn.service;



import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.awsdb.learn.awslearn.dto.EmployeeDTO;
import com.example.awsdb.learn.awslearn.serviceimpl.EmployeeServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(path = "/employee")
public class EmployeeService {


    @Autowired
    private EmployeeServiceImpl empImpl;

    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);


    @GetMapping("/getEmpById/{empid}")
    public ResponseEntity<EmployeeDTO> getEmpbyempid(@PathVariable("empid") Integer empid) {
        LOGGER.info(">>> Inside getEmpById");
        Optional<EmployeeDTO> emp = empImpl.findById(empid);
       
        return ResponseEntity.ok().body(emp.get());
    }
    
    @GetMapping(path = "/awstest")
    public String testAWS(){
        return "HELLO ";

    }
}
