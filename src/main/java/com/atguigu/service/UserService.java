package com.atguigu.service;

import com.atguigu.dao.EmployeeDao;
import com.atguigu.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployee(){
        Collection<Employee> employees = employeeDao.getAll();
        return employees;
    }

}
