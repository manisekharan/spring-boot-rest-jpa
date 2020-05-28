package org.tamil.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan
public class EventApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
	}

}
