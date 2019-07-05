package com.java.dropwizard.Service;
import com.java.dropwizard.db.DepartmentDAO;
import com.java.dropwizard.model.Departmentt;

import java.util.List;

public class DepartmentService {

    private DepartmentDAO departmentDAO;
    public DepartmentService(final DepartmentDAO departmentDAO)

    {

        this.departmentDAO=departmentDAO;

    }



    public List<Departmentt> getDepartment()

    {

        return this.departmentDAO.getDepartment();

    }

}



