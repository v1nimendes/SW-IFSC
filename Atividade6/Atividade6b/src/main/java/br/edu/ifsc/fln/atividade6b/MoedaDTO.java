package br.edu.ifsc.fln.atividade6b;

public class MoedaDTO {
	
	private String moeda;
	private double compra;
	private double venda;
	
	public MoedaDTO(String moeda, double compra, double venda) {
		this.moeda = moeda;
		this.compra = compra;
		this.venda = venda;
	}

	public String getMoeda() {
		return moeda;
	}

	public double getCompra() {
		return compra;
	}

	public double getVenda() {
		return venda;
	}
	

}
