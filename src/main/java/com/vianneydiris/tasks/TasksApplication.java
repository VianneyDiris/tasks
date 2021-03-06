package com.vianneydiris.tasks;

import com.vianneydiris.tasks.domain.Task;
import com.vianneydiris.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
		taskService.save(new Task(1L,"create spring boot application", LocalDate.now(),true));
		taskService.save(new Task(2L,"create spring project package", LocalDate.now(),false));
		};
	}
}
