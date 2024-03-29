package com.java.dropwizard;

import api.resource.EmployeeResources;
import api.resource.Service.EmployeeService;
import com.java.dropwizard.Service.DepartmentService;
import com.java.dropwizard.db.DepartmentDAO;
import com.java.dropwizard.db.EmployeeDAO;
import com.java.dropwizard.resource.DepartmentResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;


public class EmployeeApplication extends Application<EmployeeConfiguration> {
    public static void main(String[] args) throws Exception {
        new EmployeeApplication().run(args);
    }

//    public void initialize(Bootstrap<Configuration> bootstrap) {
//
//    }

    public void run(EmployeeConfiguration configuration, Environment environment) throws Exception {
        final DBIFactory dbiFactory = new DBIFactory();
        final DBI dbi = dbiFactory.build(environment, configuration.getDataSourceFactory(), "mysql");
        final EmployeeDAO employeeDAO = dbi.onDemand(EmployeeDAO.class);
        final EmployeeService employeeService = new EmployeeService(employeeDAO);

        final EmployeeResources employeeResources = new EmployeeResources(employeeService);
        environment.jersey().register(employeeResources);

        final DepartmentDAO departmentDAO=dbi.onDemand(DepartmentDAO.class);
        final DepartmentService departmentService=new DepartmentService(departmentDAO);
        final DepartmentResource departmentResources=new DepartmentResource(departmentService);

        environment.jersey().register(departmentResources);

    }

    
        }
    
