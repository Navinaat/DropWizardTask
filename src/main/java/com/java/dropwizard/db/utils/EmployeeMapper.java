package com.java.dropwizard.db.utils;

import model.Employee;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeMapper implements ResultSetMapper<Employee> {


    public Employee map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {


        Employee employee = new Employee(
                resultSet.getInt("emp_id"),
                resultSet.getString("emp_name"),

                resultSet.getInt("emp_age"),
                resultSet.getString("emp_DOB"),
                resultSet.getString("emp_PhNo"),
                resultSet.getString("emp_place"),
                resultSet.getString("dept_id")
        );
        return employee;
    }
}
