package br.com.loja_virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.loja_virtual.model")
public class LojaVirtualApplication {
	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
	}
}