package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class SpringConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds =
                new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

        ds.setUrl(
                "jdbc:mysql://localhost:3306/springmvcdb");

        ds.setUsername("root");
        ds.setPassword("root");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {

        InternalResourceViewResolver vr =
                new InternalResourceViewResolver();

        vr.setPrefix("/WEB-INF/");
        vr.setSuffix(".jsp");

        return vr;
    }
}