package br.edu.ifsc.fln.atividade6a;


public class Funcionario {
	
	private Salario salarioBruto;
	
	public Funcionario(double salarioBruto) {
		this.salarioBruto = new Salario(salarioBruto);
	}

	public double getSalarioBruto() {
		return salarioBruto.getValorBruto();
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto.setValorBruto(salarioBruto);
	}
	
	
	public double getIRPF() {
		return this.salarioBruto.calcularValorIRPF();
	}
	
	
	public double getINSS() {
		return this.salarioBruto.calcularValorINSS();	
	}
	
	
	public double getSalarioLiquido() {
		return this.salarioBruto.calcularValorLiquido();
	}

	

	
}
