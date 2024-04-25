package br.edu.ifsc.fln.trabalhofinal;

import java.util.ArrayList;
import java.util.List;


public class LivroDataSource {
	private static List<Livro> livros = new ArrayList<>();

	public static void criarLista() {
		livros.add(new Livro(1, 000001, "A garota do lago", "Charlie Donlea", "Faro Editorial Eireli", 50.00));
		
		livros.add(new Livro(2, 000002, "Box Arsène Lupin", "Leblanc, Maurice", "Novo Século Editora e Distribuidora Ltda.", 39.99));
		
		livros.add(new Livro(3, 000003, "Do mil ao milhão", "Nigro, Thiago", "Casa dos Livros Editora Ltda", 32.00));
		
		livros.add(new Livro(4, 000004, "Manual de persuasão do FBI", "Shafer, Jack; Karlins, Marvin", "Universo dos Livros Editora LTDA", 50.00));
		
		livros.add(new Livro(5, 000005, "Quem pensa enriquece", "Hill, Napoleon", "CDG Edições e Publicações Eireli", 41.90));
	}
	
	public static Livro adicionar(Livro livro) {
		livros.add(livro);
		return livro;
	}
	
	public static Livro getPorIsbn(int isbn) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					return livro;
				}
			}
		}
		return null;
	}
	
	public static List<Livro> getPorAutor(String autor) {
		List<Livro> resultado = new ArrayList<>();
		
		for (Livro livro: livros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				resultado.add(livro);
			}
		}
		
		return resultado;
	}
	
	public static Livro getPorTitulo(String titulo) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					return livro;
				}
			}
		}
		return null;		
	}
	
	public static LivroDTO getPorIsbnDTO(int isbn) {
		LivroDTO livroDTO = null;
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
					return livroDTO;
				}
			}
		}
		return livroDTO;
	}
	
	public static List<LivroDTO> getAllDTO() {
		List<LivroDTO> listaLivrosDTO = new ArrayList<>();
		if (livros != null) {
			for (Livro livro: livros) {
				LivroDTO livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
				listaLivrosDTO.add(livroDTO);
			}
		}
		return listaLivrosDTO;
	}	
	
	public static void reajustarPrecoPorId(int id, double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getId() == id) {
					livro.reajustarPreco(taxa);
				}
			}
		}
	}
	
	public static void reajustarPreco(double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				livro.reajustarPreco(taxa);
			}
		}		
	}
	
	public static List<Livro> getAll() {
		return livros;
	}

	public static void setLivros(List<Livro> livros) {
		LivroDataSource.livros = livros;
	}

}
