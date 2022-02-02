package com.dxclearninig1.personrestapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonrestapiApplication {
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
   
	public static void main(String[] args) {
		SpringApplication.run(PersonrestapiApplication.class, args);
		System.out.println("hello world");

	}

}
