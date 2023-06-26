package com.example.examsem4.controller;

import com.example.examsem4.entity.Employee;
import com.example.examsem4.repository.imp.EmployeeRepositoryImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name= "EmployeeController", value = "/employeeList")

public class EmployeeController extends HttpServlet {
    private EmployeeRepositoryImp employeeRepositoryImp = new EmployeeRepositoryImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees =employeeRepositoryImp.getALl();
        RequestDispatcher dispatcher = req.getRequestDispatcher("employeeList.jsp");
        req.setAttribute("employees", employees );
        dispatcher.forward(req, resp);
    }

}
