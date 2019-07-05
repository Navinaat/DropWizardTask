package com.java.dropwizard.db;

import com.java.dropwizard.db.utils.EmployeeMapper;
import model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {

    @SqlQuery("select * from  `details` ")
    public List<Employee> getEmployee();

    @SqlQuery("select * from `details` where emp_id= :emp_id")
    public Employee getEmploye(@Bind("emp_id")final int emp_id);

//
//
//    @SqlUpdate("INSERT INTO `employee` (`emp_id`,`name`,`age`,`place`,`dob`,`phone`,`dept_id`) VALUES (:eid , :name, :age, :place, :dob, :phone, :deptid );")
//
//    public void insert(@BindBean  Employee employee);
//
//
//
//    @SqlUpdate("update employee set name = coalesce(:name ,name) where emp_id= :emp_id")
//
//    void editEmploye(@BindBean Employee employee);



    @SqlUpdate("delete from details where emp_id= :emp_id")

    int deleteEmployee(@Bind("emp_id")final int emp_id);

//    @SqlUpdate("create table javaTest(id int);")

//    public void create();

}



