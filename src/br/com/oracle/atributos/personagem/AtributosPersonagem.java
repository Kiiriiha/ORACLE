package br.com.oracle.atributos.personagem;

import br.com.oracle.atributos.AtributosGerais;

public abstract class AtributosPersonagem extends AtributosGerais {
	private int pontosDeVida;

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}
