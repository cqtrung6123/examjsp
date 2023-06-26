package com.example.examsem4.repository;

import com.example.examsem4.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    void  save(Employee employee);
    void updateEmp(Employee employee);
    List<Employee> getALl();
    void  delete(int id);
}
