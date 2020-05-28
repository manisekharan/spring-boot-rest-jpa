package org.tamil.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan
public class EventApplication {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);

		applicationContext =
				new AnnotationConfigApplicationContext(EventApplication.class);

		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
