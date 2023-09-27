package br.com.oracle.persona.inimigos;

public class InimigosFactory {
	public static final Inimigo retornarNovoInimigo(RacasEnum raca) {
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
