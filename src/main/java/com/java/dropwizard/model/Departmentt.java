package com.java.dropwizard.model;

public class Departmentt {

    String dept_id;

    String dept_name;

    @Override

    public String toString() {

        return "Department{" +

                "dept_id=" + dept_id +

                ", dept_name='" + dept_name + '\'' +

                '}';
    }

    public String getdept_id() {

        return dept_id;

    }


    public void setdept_id(String dept_id) {

        this.dept_id = dept_id;

    }


    public String getdept_name() {

        return dept_name;

    }


    public void setdept_name(String dept_name) {

        this.dept_name = dept_name;

    }

    public Departmentt(String dept_id, String dept_name) {

        this.dept_id = dept_id;

        this.dept_name = dept_name;

    }


}

