﻿package br.edu.ifsc.fln.atividade6a;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Salario {

	private double valorBruto;
	
	
	public Salario(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	
	public double calcularValorIRPF() {
		
		double irpf;
		
		if (valorBruto <= 1903.98) {
			 irpf = 0;
		}
		else if (valorBruto <= 2826.65) {
			irpf =  (valorBruto * 0.075) - 142.80;
		}
		else if (valorBruto <= 3751.05) {
			irpf =  (valorBruto * 0.15) - 354.80;
		}
		else if (valorBruto <= 4664.68) {
			irpf =  (valorBruto * 0.225) - 636.13;
		}
		else {
			irpf = (valorBruto * 0.275) - 869.36;
		}
		
		return new BigDecimal(String.valueOf(irpf)).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
		
	}
	
	public double calcularValorINSS() {
		
		double inss;
		
		if (valorBruto <= 1045) {
			inss = valorBruto * 0.075;
		}
		else if (valorBruto <= 2089.60) {
			inss = valorBruto * 0.09;
		}
		else if (valorBruto <= 3134.40) {
			inss = valorBruto * 0.12;
		}
		else if (valorBruto <= 6101.06) {
			inss = valorBruto * 0.14;
		}
		else {
			inss = valorBruto * 0.155;
		}
		
		return new BigDecimal(String.valueOf(inss)).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
		
	}
	
	public double calcularValorLiquido() {
		return this.valorBruto - calcularValorIRPF() - calcularValorINSS();	
	}
	
	
}
