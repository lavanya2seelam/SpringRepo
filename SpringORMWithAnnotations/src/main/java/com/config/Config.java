package com.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com")
@EnableTransactionManagement
public class Config {

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		sf.setHibernateProperties(getProperties());
		sf.setPackagesToScan("com.models");
		return sf;
	}

	@Bean
	public HibernateTransactionManager getTransaction() {
		HibernateTransactionManager tm = new HibernateTransactionManager();
		tm.setSessionFactory(getSessionFactory().getObject());
		return tm;
	}

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();

		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/lavanyadb");
		dm.setUsername("root");
		dm.setPassword("root");

		return dm;
	}

	public Properties getProperties() {
		Properties prop = new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.setProperty("hibernate.show_sql", "true");
		prop.setProperty("hibernate.format_sql", "true");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		return prop;
	}

}
