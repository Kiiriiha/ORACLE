package br.com.oracle.persona.inimigos;

import br.com.oracle.persona.personagem;
import br.com.oracle.persona.racas;

public abstract class Inimigo extends personagem {
	
	
	
	 private int experiencia;
	
//fazer array de loot

	public Inimigo() { }
	
	
	
	
	
	
	
	public Inimigo(racas raca) {
		switch(raca) {
		case ZUMBI:
			System.out.println("Raça: Zumbi");
			break;
		case HUMANO:
			System.out.println("Raça: Humano");
			break;
			
		case ELFO :
			System.out.println("Raça: Elfo");

			break;
			
		case GOBLIN:
			System.out.println("Raça: Goblin");
			break;
			
			default:
				System.out.println("Escolha uma Raça");

				break;
		}
	}
	

	}

	

