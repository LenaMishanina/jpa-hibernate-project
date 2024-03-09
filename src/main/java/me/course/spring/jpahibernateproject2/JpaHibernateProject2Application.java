package me.course.spring.jpahibernateproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "me.course.spring.controller")
public class JpaHibernateProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateProject2Application.class, args);
	}

}
