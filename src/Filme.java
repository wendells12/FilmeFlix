import java.util.ArrayList;

public class Filme {
	
	//atributos
	
	private String titulo;
	private String diretor;
	private int anoLancamento;
	private String genero;
	private ArrayList<Avaliacao> avaliacoes;
	
	//metodo construtor
	public Filme(String titulo, String diretor, int anoLancamento, String genero) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.avaliacoes = new ArrayList<Avaliacao>();
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	

}
