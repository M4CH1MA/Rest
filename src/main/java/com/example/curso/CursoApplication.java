package com.example.curso;

import com.example.curso.domain.entity.Cliente;
import com.example.curso.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CursoApplication {



	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
