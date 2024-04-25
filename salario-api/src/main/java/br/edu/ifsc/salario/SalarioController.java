package br.edu.ifsc.salario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class SalarioController {
	
	@RequestMapping(value="/calcular_salario/{nome}/{salarioBase}/{dependentes}")
	public Float calcular_salario(
			@PathVariable("salarioBase") Float salarioBase,
			@PathVariable("dependentes") Float dependentes) 
	{
		
		Float irpf =0.0f;
		
		if(salarioBase>8500.00) 
		{
			irpf += salarioBase  * 0.275f;
		}
		else if(salarioBase >= 5000.00) 
		{
			irpf += salarioBase * 0.15f;
		}
		
		Float salarioFamilia=0.0f;
		   
		if(dependentes>0) 
		{
			salarioFamilia += dependentes * 150.00f;
		}
		return salarioBase - irpf + salarioFamilia;
	}
}