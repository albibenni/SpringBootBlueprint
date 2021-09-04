package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication
				.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> helloTry(){
		return List.of(
				new Student(
						1L,
						"Luca",
						"luca@gmail.com",
						LocalDate.of(2000, 07, 15),
						21
				)
		);
	}
}
