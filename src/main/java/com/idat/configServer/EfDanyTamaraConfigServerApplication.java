package com.idat.configServer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class EfDanyTamaraConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDanyTamaraConfigServerApplication.class, args);
	}

}
