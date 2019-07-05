package api.resource.Service;

import com.java.dropwizard.db.EmployeeDAO;
import model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;


    public EmployeeService(final EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployee() {
        return this.employeeDAO.getEmployee();
    }
    public int deleteEmployee(int id)

    {

        return this.employeeDAO.deleteEmployee(id);

    }
    public Employee getEmploye(final int empid)

    {

        return this.employeeDAO.getEmploye( empid);

    }

}
