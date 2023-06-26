package com.example.examsem4.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Employee {
    public int id;
    public String fullName;
    public Date birthday;
    public String address;
    public String position;
    public String department;
}
