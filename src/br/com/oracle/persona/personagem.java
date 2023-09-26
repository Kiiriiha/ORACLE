package br.com.oracle.persona;

public class personagem {

	 private String nome;
	 private int pontosDeVida;
	 private int forca;
	 private int magia;
	 private int velocidade;
	 private int defesa;
	 private int nivel;

	void atacar() {
		System.out.println("Atacou");
	}

	void defender() {
		System.out.println("Defendeu");

	}

	void usarMagia() {
		System.out.println("MAGIA!!!");

	}

	void usarItem() {
		System.out.println("Usou o item: ");

	}
	 public void atributoNome(String nome) {
		this.nome = nome;
	}
	public void exibirNome() {
		System.out.println("Nome: " + this.nome);
	}
	protected String retornarNome() {
		return this.nome;
	}
}
