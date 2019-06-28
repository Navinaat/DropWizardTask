package com.java.dropwizard.db;


import com.java.dropwizard.db.utils.EmployeeMapper;
import model.Employee;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {

    @SqlQuery("select * from  `details` ")
    public List<Employee> getEmployee();
}
