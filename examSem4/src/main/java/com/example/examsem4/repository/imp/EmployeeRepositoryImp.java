package com.example.examsem4.repository.imp;

import com.example.examsem4.config.DatabaseConnect;
import com.example.examsem4.entity.Employee;
import com.example.examsem4.repository.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements EmployeeRepository {

    public Connection connection;
    public EmployeeRepositoryImp() {
        connection = DatabaseConnect.openConnection();
    }
    @Override
    public void save(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into employee(full_name,birthday,address, position,department) values (?, ?,?,?,?)"
            );
            preparedStatement.setString(1,employee.getFullName());
            preparedStatement.setDate(2, employee.getBirthday());
            preparedStatement.setString(3,employee.getAddress());
            preparedStatement.setString(4,employee.getPosition());
            preparedStatement.setString(5,employee.getDepartment());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmp(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "update employee set fullname=?,birthday=?,address=?,possition=?,department=? where id=?"
            );
            preparedStatement.setString(1,employee.getFullName());
            preparedStatement.setDate(2, employee.getBirthday());
            preparedStatement.setString(3,employee.getAddress());
            preparedStatement.setString(4,employee.getPosition());
            preparedStatement.setString(5,employee.getDepartment());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getALl() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from employee");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFullName(rs.getString("full_name"));
                employee.setBirthday(rs.getDate("birthday"));
                employee.setAddress(rs.getString("address"));
                employee.setPosition(rs.getString("position"));
                employee.setDepartment(rs.getString("department"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    @Override
    public void delete(int id) {
        List<Employee> employeeList =getALl();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete * from employee where id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
