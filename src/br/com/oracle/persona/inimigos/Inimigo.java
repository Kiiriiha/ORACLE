package br.com.oracle.persona.inimigos;

import br.com.oracle.atributos.personagem.inimigo.AtributosInimigo;
import br.com.oracle.persona.Personagem;

public abstract class Inimigo extends Personagem {

//fazer array de loot

	
	
	public Inimigo(RacasEnum raca) {
		this.raca = raca;
		
	}
	
RacasEnum raca;
AtributosInimigo atributos;

public AtributosInimigo getAtributos() {
	return atributos;
}

public void setAtributos(AtributosInimigo atributos) {
	this.atributos = atributos;
}
}
