package com.alsomeb.devopsfinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DevopsFinalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DevopsFinalApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Merge conflict + Test feature + Test");
	}
}
