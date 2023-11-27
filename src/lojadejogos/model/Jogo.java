package lojadejogos.model;

public class Jogo extends Produto {
	
	private String genero;

	public Jogo(int id, String nome, int tipo, double preco, String genero) {
		super(id, nome, tipo, preco);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("genero: " + genero);
	}
	
	
}
