import java.util.ArrayList;

public class BDSimulado {
	//atribuytos
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuario;
	
	//metodo construtor
	public BDSimulado(){
		//instanciar o atributo filmes
		this.filmes = new ArrayList<Filme>();
		
		//instanciar objetos
		Filme f1 = new Filme("Star Wars 1", "Marcos Vinicius", 1977, "Ficção científica");
		Filme f2 = new Filme("Star Wars:  O Despertar da Força", "Marcos Vinicius", 2015, "Ficção científica");
		Filme f3 = new Filme("Forrest Gump", "Robert Zemeeckis", 1994, "Drama");
		Filme f4 = new Filme("Clube da Luta", "David Fincher", 1999, "Drama");
		Filme f5 = new Filme("Os Outros", "Alejandro Amenabar", 2001, "Suspence");
		Filme f6 = new Filme("Titanic", "James Cameron", 1999, "Romance");
		
		//colocar os filmes na lista
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);
		
		//instanciar o atributo do usuario
		this.usuario = new ArrayList<Usuario>();
		
		//instanciar objetos de classe usuario
		Usuario u1 = new Usuario("João", "Masculino", 55);
		Usuario u2 = new Usuario("José", "Masculino", 15);
		Usuario u3 = new Usuario("Adão", "Masculino", 99);
		Usuario u4 = new Usuario("Maria", "Feminino", 27);
		Usuario u5 = new Usuario("Josefina", "Feminino", 42);
		Usuario u6 = new Usuario("Amélia", "Feminino", 12);
		
		//colocar os usuarios na lista
		this.usuario.add(u1);
		this.usuario.add(u2);
		this.usuario.add(u3);
		this.usuario.add(u4);
		this.usuario.add(u5);
		this.usuario.add(u6);
		
		
		
		
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
       //metodo que retorna lista de filmes de um ano informado
	public ArrayList<Filme> getFilmesPorAno(int ano){
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		
		//percorrer a lista de filmes
		
		for (int i = 0; i <this.filmes.size(); i++){
			
			//verificar se o filme é do ano informado
			
			if (this.filmes.get(i).getAnoLancamento() == ano)
		          resultado.add(this.filmes.get(i));
		}
		return resultado;
	}
	//metodo que retorna a lista de filmes de um diretor informado
	public ArrayList<Filme> getFilmesPorDiretor(String diretor){
		
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		//percorrer lista de filmes
		for (int i = 0; i < this.filmes.size(); i++){
	
	//verificar se o filme do diretor
	if (this.filmes.get(i).getDiretor().equals(diretor)){
		resultado.add(this.filmes.get(i));
		
		
	}
	
}
return resultado;

	}
}
