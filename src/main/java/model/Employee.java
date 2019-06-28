package model;

public class Employee {

    private int emp_id;
    private String emp_name;
    private String emp_dob;
    private int emp_age;
    private String emp_place;
    private String emp_PhNo;
    private String dept_id;

    @Override
    public String toString() {
        return "EmployeeApplication{" +
                "id=" + emp_id +
                ", name='" + emp_name + '\'' +
                ", dob='" + emp_dob + '\'' +
                ", age=" + emp_age +
                ", place='" + emp_place + '\'' +
                ", phone='" + emp_PhNo + '\'' +
                ", dept_id=" + dept_id +
                '}';
    }

    public Employee(int emp_id, String emp_name, int emp_age, String emp_place, String emp_dob, String emp_PhNo, String dept_id) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_dob = emp_dob;
        this.emp_age = emp_age;
        this.emp_place = emp_place;
        this.emp_PhNo = emp_PhNo;
        this.dept_id = dept_id;
    }

    public int getemp_id() {
        return emp_id;
    }

    public void setemp_id(int id) {
        this.emp_id = id;
    }

    public String getname() {
        return emp_name;
    }

    public void setemp_name(String name) {
        this.emp_name = name;
    }

    public int getemp_age() {
        return emp_age;
    }

    public void setemp_age(int age) {
        this.emp_age = age;
    }

    public String getemp_Place() {
        return emp_place;
    }

    public void setemp_Place(String place) {
        this.emp_place = place;
    }

    public String getemp_DOB() {
        return emp_dob;
    }

    public void setemp_DOB(String dob) {
        this.emp_dob = dob;
    }

    public String getemp_PhNo() {
        return emp_PhNo;
    }

    public void setemp_PhNo(String PhNo) {
        this.emp_PhNo = emp_PhNo;
    }

    public String getemp_dept_id() {
        return dept_id;
    }

    public void setdeptid(String dept_id) {
        this.dept_id = dept_id;
    }
}




