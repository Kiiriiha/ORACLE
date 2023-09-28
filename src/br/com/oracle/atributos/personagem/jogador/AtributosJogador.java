package br.com.oracle.atributos.personagem.jogador;

import br.com.oracle.atributos.personagem.AtributosPersonagem;

public class AtributosJogador extends AtributosPersonagem {

	private int nivel;
	private int experienciaAtual;
	private int experienciaProximoNivel;

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getExperienciaAtual() {
		return experienciaAtual;
	}

	public void setExperienciaAtual(int experienciaAtual) {
		this.experienciaAtual = experienciaAtual;
	}

	public int getExperienciaProximoNivel() {
		return experienciaProximoNivel;
	}

	public void setExperienciaProximoNivel(int experienciaProximoNivel) {
		this.experienciaProximoNivel = experienciaProximoNivel;
	}
}
