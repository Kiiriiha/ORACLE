package br.com.oracle.persona.inimigos;

import br.com.oracle.persona.racas;

public class InimigosFactory {
	public Inimigo retornarNovoInimigo(racas raca) {
		Inimigo retorno = null;

		switch (raca) {
		case ZUMBI:
			retorno = new Zumbi();
			break;
		case HUMANO:
			retorno = new Humano();
			break;

		case ELFO:
			retorno = new Elfo();
			break;

		case GOBLIN:
			retorno = new Goblin();
			break;

		default:
			System.out.println("Escolha uma Raça");

			break;
		}
		return retorno;
	}
}
