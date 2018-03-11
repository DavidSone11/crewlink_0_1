package com.mathologic.projects.crewlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.Serializable;

@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan(basePackages = "com.mathologic.projects.crewlink.models")
public class CrewlinkApplication implements Serializable {

	public static void main(String[] args) {

		SpringApplication.run(CrewlinkApplication.class, args);
	}
}
