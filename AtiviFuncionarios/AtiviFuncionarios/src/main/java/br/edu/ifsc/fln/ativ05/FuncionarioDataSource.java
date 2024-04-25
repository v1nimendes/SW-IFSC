package br.edu.ifsc.fln.ativ05;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {

	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(1, "Vinicius", 5000, 4));
		listaFuncionarios.add(new Funcionario(2, "Joao", 8500, 2));
		listaFuncionarios.add(new Funcionario(3, "Cleber", 35000, 3));
		listaFuncionarios.add(new Funcionario(4, "Robson", 2000, 6));
	}
	
	public static List<Funcionario> getLista() {
		return listaFuncionarios;
	}
	 
	public static void addFuncionario(Funcionario func){
		listaFuncionarios.add(func);
	}
	
	
	public static Funcionario getFuncionario(int matric){
		for (Funcionario funcionario : listaFuncionarios){
			if (matric == funcionario.getMatricula()){
				return funcionario;
			}
		}
		return new Funcionario(0, "Não existe", 0.0, 0); 
	}
	
	
	public static double getSalariodeFuncionario(int matric) {
		Funcionario funcionario = getFuncionario(matric);
		
		return funcionario.calcularSalarioLiquido();
		
	}
	
	
}
