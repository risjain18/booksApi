package com.sapient.book_api;

import org.springframework.boot.SpringApplication;

public class TestBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
