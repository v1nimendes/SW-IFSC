package br.edu.ifsc.fln.atividade6a;


public class FuncionarioDTO {

	private double salarioBruto;
	private double irpf;
	private double inss;
	private double salarioLiquido;	
	
	public FuncionarioDTO(double salarioBruto, double irpf, double inss, double salarioLiquido) {
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		this.inss = inss;
		this.salarioLiquido = salarioLiquido;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public double getIrpf() {
		return irpf;
	}

	public double getInss() {
		return inss;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}
}
