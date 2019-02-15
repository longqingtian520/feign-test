package com.criss.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.criss.wang.main.FeginApiApplication;

@Import({FeginApiApplication.class})
@SpringBootApplication
@ComponentScan({
	"com.criss.wang.controller.**",
	"com.criss.wang.service.**"
})
public class FeginTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginTestApplication.class, args);
	}

}

