package net.acceltech.springopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOpenshiftApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringOpenshiftApplication.class, args);

		System.out.println("Server started......");
	}

}
