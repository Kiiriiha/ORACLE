package br.com.oracle;

import br.com.oracle.persona.jogador;
import br.com.oracle.persona.monstro;
import br.com.oracle.persona.racas;

public class OracleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jogador player1 = new jogador();
player1.atributoNome("Kiriha");

player1.exibirNome();


monstro goblin = new monstro(racas.ELFO);
goblin.atributoNome("ELFAO");
goblin.exibirNome();
	}

}
