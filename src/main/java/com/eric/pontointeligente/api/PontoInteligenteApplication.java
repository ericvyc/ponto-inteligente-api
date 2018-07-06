package com.eric.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.eric.pontointeligente.api.repositories.LancamentoRepository;

import controllers.CadastroPJController;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackageClasses = CadastroPJController.class)
@ComponentScan(basePackageClasses = LancamentoRepository.class)
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}
}