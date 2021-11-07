package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.Audience.re", "com.Categoria.re", "com.Mensajes.re", "com.Clientes.re", "com.Reservaciones.re"})

public class Reto3alexApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3alexApplication.class, args);
	}

}
