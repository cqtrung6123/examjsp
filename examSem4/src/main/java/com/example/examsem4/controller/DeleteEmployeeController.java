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

@WebServlet(name= "DeleteEmployeeController", value = "/DeleteEmployees")

public class DeleteEmployeeController extends HttpServlet {
    private EmployeeRepositoryImp employeeRepositoryImp = new EmployeeRepositoryImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("delete.jsp");
        String id = req.getParameter("id");
        employeeRepositoryImp.delete(Integer.parseInt(id));
        dispatcher.forward(req, resp);
    }

}
