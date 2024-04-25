package br.edu.ifsc.fln.primeiroprojeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
	@GetMapping("/mensagem")
	@ResponseBody
	public String mensagem() {
		return "Aulas de Serviços Web - Meu primeiro Serviço Web";
	}

	@GetMapping("/numero_inteiro")
	@ResponseBody
	public int obterNumeroInteiro() {
		Random r= new Random();
		return r.nextInt();
	}
	
	@GetMapping("/numeros")
	@ResponseBody
	public List<Integer> obterNumero() {
		Random r= new Random();
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i <6; i++) {
			int novoNumero = 0;
			do {
				novoNumero = r.nextInt(60)+1;
			} while (numeros.contains(novoNumero));
	
			numeros.add(novoNumero);
		}
		return numeros;
	}
}