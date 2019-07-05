package com.java.dropwizard.db.mapper;

import com.java.dropwizard.model.Departmentt;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper implements ResultSetMapper<Departmentt> {

    public Departmentt map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        Departmentt department = new Departmentt(

                resultSet.getString("dept_id"),

                resultSet.getString("dept_name")
        );
        return department;
    }
}

