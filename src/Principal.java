import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// instanciar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//recuperar a lista de filmes e usuarios
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuario = bds.getUsuario();
		
		//exibindo filmes que foram feitos depois do ano de 2000
		for (int i = 0; i < filmes.size(); i++){
			if (filmes.get(i).getAnoLancamento() > 2000){
				System.out.println(filmes.get(i).getTitulo() + " / " + filmes.get(i).getGenero());
				
			}
		}
                ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(1999);
                //imprimir
                for (int i = 0; i < filmesPorAno.size(); i++){
                	System.out.println(filmesPorAno.get(i).getTitulo());
                }
          
                ArrayList<Filme> FilmesPorDiretor = bds.getFilmesPorDiretor("James Cameron");
                //imprimir
                for (int i = 0; i < FilmesPorDiretor.size(); i++){
                	System.out.println(FilmesPorDiretor.get(i).getTitulo());
	}

	}
}
