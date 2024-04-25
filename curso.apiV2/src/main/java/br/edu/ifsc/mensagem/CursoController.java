package br.edu.ifsc.mensagem;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

	private static final String template = "Curso: %s!";
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/curso")
	public Curso mensagem(@RequestParam(value="curso", defaultValue="nenhum")
			String curso) {
		return new Curso(contador.incrementAndGet(), String.format(template, curso));
		
	}
}
