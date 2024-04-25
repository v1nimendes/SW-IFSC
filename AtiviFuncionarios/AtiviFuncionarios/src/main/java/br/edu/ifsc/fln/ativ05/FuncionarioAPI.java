package br.edu.ifsc.fln.ativ05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncionarioAPI {

	public static void main(String[] args) {
		FuncionarioDataSource.criarLista();
		SpringApplication.run(FuncionarioAPI.class, args);
	}

}
