package br.com.oracle.persona.jogador.classes;

import br.com.oracle.itens.equipamentos.armas.Arma;

import br.com.oracle.persona.jogador.Jogador;

public class Guerreiro extends Jogador{
	
	public Guerreiro() {
		super(TipoClasseEnum.GUERREIRO);
	}
	private Arma espada;
	private Arma machado;
	private Arma escudo;
	

}
