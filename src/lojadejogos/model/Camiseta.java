package lojadejogos.model;

public class Camiseta extends Produto {

	private String tamanho;
	
	public Camiseta(int id, String nome, int tipo, double preco, String tamanho) {
		super(id, nome, tipo, preco);
		tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		tamanho = tamanho;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println(" tamanho: " + tamanho);
	}
	
	
}
