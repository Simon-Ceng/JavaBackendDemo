package com.manager.system;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

@SpringBootApplication
@MapperScan("com.manager.system.dao")
@EnableScheduling
@EnableTransactionManagement
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ServletComponentScan
public class ManagerSystemApplication extends SpringBootServletInitializer implements ApplicationListener<ApplicationEvent>{
	private static final Logger logger = LogManager.getLogger(ManagerSystemApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ManagerSystemApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagerSystemApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		String event = applicationEvent.getClass().getName();
		if (event.contains("ContextRefreshedEvent")) {
		}
		if (event.contains("ContextClosedEvent")) {
			Enumeration<Driver> drivers = DriverManager.getDrivers();
			Driver d = null;
			while (drivers.hasMoreElements()) {
				try {
					d = drivers.nextElement();
					DriverManager.deregisterDriver(d);
				} catch (Exception e) {
				}
			}
		}
	}

}