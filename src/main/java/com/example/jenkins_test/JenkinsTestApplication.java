package com.example.jenkins_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	private static Logger  log = LoggerFactory.getLogger(JenkinsTestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
		
		log.info("111111111111111");
	}

}
