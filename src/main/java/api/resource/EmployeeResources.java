package api.resource;


import api.resource.Service.EmployeeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/employee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {
    private EmployeeService employeeService;

    public EmployeeResources(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GET
    public Response getEmployee() {
        return Response.ok().entity(this.employeeService.getEmployee()).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteEmployee(@PathParam("id")final int id)

    {
        return Response.ok().entity(this.employeeService.deleteEmployee(id)).build();

    }
    @GET

    @Path("/{emp_id}")
    public Response getEmployee(@PathParam("emp_id") final int emp_id) {

        System.out.println("id is " + emp_id);

        return Response.ok().entity(this.employeeService.getEmploye(emp_id)).build();

    }


}
