package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
	@PropertySource({"file:D:\\Prog_java\\Projects\\course.properties"})
})
public class SpringbootDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoProjectApplication.class, args);
	}

}
