package com.springbean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import com.model.*;
import com.config.Config2;
public class SpringJDBCWithoutXml {

public static void main(String[] args) {
	ApplicationContext context =
		    new AnnotationConfigApplicationContext(Config2.class);
JdbcTemplate jdbcTemplate = context.getBean("templet", JdbcTemplate.class);

List<Aadhar> adhar = jdbcTemplate.query(
	    "select * from Aadhar",
	    (rs,rowNum)-> new Aadhar(
	        rs.getInt("a_id"),
	        rs.getString("address")));
System.out.println(adhar);

}

}