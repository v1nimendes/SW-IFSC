package br.edu.ifsc.mensagem;

public class Curso {
	
private final long id;
	
private final String curso;

private final int cargaHoraria;
	
	public long getId() {
		return id;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public Curso(long id, String curso, int cargaHoraria) {
		this.id = id;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}
}
