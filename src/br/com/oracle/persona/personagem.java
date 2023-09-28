package br.com.oracle.persona;

import br.com.oracle.persona.inimigos.RacasEnum;

public abstract class Personagem {

	private String nome;
	private RacasEnum raca;


	
	
	public Personagem() {}

	
	
	public abstract void atacar();

	public abstract void defender();

	public abstract void usarMagia();

	
	

}
