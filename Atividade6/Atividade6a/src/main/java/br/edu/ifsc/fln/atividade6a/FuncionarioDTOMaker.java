package br.edu.ifsc.fln.atividade6a;


public class FuncionarioDTOMaker {

	
	public static double getSalarioLiquido(double salarioBruto) {
		Funcionario funcionario = new Funcionario(salarioBruto);
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
		return funcionarioDTO.getSalarioLiquido();
	}
	
	
	public static FuncionarioDTO getFuncionarioCompleto(double salarioBruto) {
		Funcionario funcionario = new Funcionario(salarioBruto);
		return new FuncionarioDTO(
				funcionario.getSalarioBruto(),
				funcionario.getIRPF(),
				funcionario.getINSS(),
				funcionario.getSalarioLiquido()
				);
	}

	
}
