package br.com.oracle.persona;

public abstract class personagem {

	private String nome;
	private racas raca;
	private int pontosDeVida;
	private int forca;
	private int magia;
	private int velocidade;
	private int defesa;
	private int nivel;

	public personagem() {}

	
	
	public abstract void atacar();

	public abstract void defender();

	public abstract void usarMagia();

	
	
	public void exibirNome() {
		System.out.println("Nome: " + this.nome);
	}

	protected String retornarNome() {
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public racas getRaca() {
		return raca;
	}

	public void setRaca(racas raca) {
		this.raca = raca;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
