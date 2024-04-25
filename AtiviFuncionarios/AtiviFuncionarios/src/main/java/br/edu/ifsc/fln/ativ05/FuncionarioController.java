package br.edu.ifsc.fln.ativ05;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
	
	
	@RequestMapping(value="/novo/{matric}/{nome}/{sal}/{dep}", method=RequestMethod.GET)
	public Funcionario criarNovo(
			@PathVariable("matric") int matric, 
			@PathVariable("nome") String nome,
			@PathVariable("sal") double salarioBase, 
			@PathVariable("dep") int dep){
		
		Funcionario fulano = new Funcionario(matric, nome, salarioBase, dep);		
		FuncionarioDataSource.addFuncionario(fulano);
		
		return fulano;
	}
	
	@RequestMapping(value="/listarFuncionarios",method=RequestMethod.GET)
	public List<Funcionario> listar(){
		
		return FuncionarioDataSource.getLista();
	}
	
	@RequestMapping(value="/pesquisar/{matric}",method=RequestMethod.GET)
	public Funcionario getFuncionario(
			@PathVariable("matric") int matric){
		
		return FuncionarioDataSource.getFuncionario(matric);
	}
	
	@RequestMapping(value="/salario/{matric}",method=RequestMethod.GET)
	public double getSalario(
			@PathVariable("matric") int matric){
		
		return FuncionarioDataSource.getSalariodeFuncionario(matric);

	}

	
}
