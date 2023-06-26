package com.example.examsem4.controller;

import com.example.examsem4.entity.Employee;
import com.example.examsem4.repository.imp.EmployeeRepositoryImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;


@WebServlet(name= "NewEmployeeController", value = "/addEmployee")
public class NewEmployeeController extends HttpServlet {
    private EmployeeRepositoryImp employeeRepositoryImp = new EmployeeRepositoryImp();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String birth = req.getParameter("birthday");
        Date birthday = Date.valueOf(birth);
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setBirthday(birthday);
        employee.setAddress(address);
        employee.setPosition(position);
        employee.setDepartment(department);
        employeeRepositoryImp.save(employee);
        resp.sendRedirect("/employeeList");
    }
}
