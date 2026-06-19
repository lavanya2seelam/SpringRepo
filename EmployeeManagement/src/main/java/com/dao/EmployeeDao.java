package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Employee e) {

        String sql =
        "insert into employee values(?,?,?)";

        return jdbcTemplate.update(
                sql,
                e.getId(),
                e.getName(),
                e.getSalary());
    }

    public int update(Employee e) {

        String sql =
        "update employee set name=?,salary=? where id=?";

        return jdbcTemplate.update(
                sql,
                e.getName(),
                e.getSalary(),
                e.getId());
    }

    public int delete(int id) {

        String sql =
        "delete from employee where id=?";

        return jdbcTemplate.update(sql,id);
    }

}