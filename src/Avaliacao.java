
public class Avaliacao {
	
	//atributos
	private Usuario usuario;
	private int nota;
	
	//metodo conbstrutor
	public Avaliacao(Usuario usuario, int nota) {
		super();
		this.usuario = usuario;
		this.nota = nota;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	

}
