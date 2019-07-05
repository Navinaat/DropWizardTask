package com.java.dropwizard.db;

import com.java.dropwizard.db.mapper.DepartmentMapper;
import com.java.dropwizard.model.Departmentt;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(DepartmentMapper.class)

    public interface DepartmentDAO
{

    @SqlQuery("select * from `department`")

        public List<Departmentt> getDepartment();


}

