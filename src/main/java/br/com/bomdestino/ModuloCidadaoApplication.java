package br.com.bomdestino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class ModuloCidadaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuloCidadaoApplication.class, args);
	}

}
