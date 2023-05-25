package io.kcj.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication   
@EnableAutoConfiguration
//@ComponentScan(basePackages={"io.kcj.springbootstarter"})
@EnableJpaRepositories(basePackages= {
		"io.kcj.springbootstarter.topic",
		"io.kcj.springbootstarter.course"
})
//@EnableTransactionManagement
//@EntityScan(basePackages= {
//		"io.kcj.springbootstarter.topic",
//		"io.kcj.springbootstarter.course"
//})
public class StartApiApp {

	public static void main(String[] args) {
		SpringApplication.run(StartApiApp.class, args);
		
	}

}
