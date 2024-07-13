package com.example.awsdb.learn.awslearn.serviceimpl;

import org.springframework.data.repository.CrudRepository;

import com.example.awsdb.learn.awslearn.dto.EmployeeDTO;


public interface EmployeeServiceImpl extends CrudRepository<EmployeeDTO,Integer>{

}
