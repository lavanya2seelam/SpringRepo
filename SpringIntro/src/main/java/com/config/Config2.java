package com.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.model")
public class Config2 {
	
	@Bean("templet")
	public JdbcTemplate getJdbcTemplet() {
		DataSource dataSource = getDataSource();
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3307/lavanyadb","root", "root");
		return dataSource;
		
	}

}
