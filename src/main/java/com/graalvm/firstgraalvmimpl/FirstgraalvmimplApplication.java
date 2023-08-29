package com.graalvm.firstgraalvmimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstgraalvmimplApplication {

	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(FirstgraalvmimplApplication.class, args);
	}

}
