package com.application;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.model.*;
public class SpringJDBCEx {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = context.getBean("templet", JdbcTemplate.class);
//		insert(jdbcTemplate);
		
//		update(jdbcTemplate);
//		delete(jdbcTemplate);
//		selectByOneId(jdbcTemplate);
//		selectAll(jdbcTemplate);
		
		//using lambda expression
		List<Student> student = jdbcTemplate.query("select * from student",  (rs,rowNum)-> new Student (rs.getInt("id"),rs.getString("name")));
		System.out.println(student);
		

	}

	private static void selectAll(JdbcTemplate jdbcTemplate) {
		List<Student> student = jdbcTemplate.query("select * from student",  new RowMapper<Student>() {
	        @Override
	        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	            return new Student(
	                rs.getInt("id"),
	                rs.getString("name")
	            );
	        }
	    });
		System.out.println(student);
	}

	private static void selectByOneId(JdbcTemplate jdbcTemplate) {
		Student student = jdbcTemplate.queryForObject("select * from student where id = ?",  new RowMapper<Student>() {
	        @Override
	        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	            return new Student(
	                rs.getInt("id"),
	                rs.getString("name")
	            );
	        }
	    },2);
		System.out.println(student);
	}

	private static void delete(JdbcTemplate jdbcTemplate) {
		int update = jdbcTemplate.update("delete from student where id = ?",3);
		System.out.println(update +"updated successfully");
	}

	private static void update(JdbcTemplate jdbcTemplate) {
		int update = jdbcTemplate.update("update student set name = ? where id = ?","Kavya",2);
		System.out.println(update +"updated successfully");
	}
 cd
	private static void insert(JdbcTemplate jdbcTemplate) {
		int update = jdbcTemplate.update("insert into student(id, name) values (?, ?)",3,"Teja");
		System.out.println(update +"updated successfully");
	}

}
