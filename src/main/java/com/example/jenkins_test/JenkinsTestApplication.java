package com.example.jenkins_test;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication implements CommandLineRunner{

	private static Logger  log = LoggerFactory.getLogger(JenkinsTestApplication.class);
	
	public static void main(String[] args)  {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner Args: " + Arrays.toString(args));
    }
}
