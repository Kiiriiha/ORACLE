package br.com.oracle;

import br.com.oracle.persona.jogador;
import br.com.oracle.persona.monstro;

public class OracleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jogador player1 = new jogador();
player1.exibirNome();


monstro goblin = new monstro();
goblin.atributoNome("Goblao");
goblin.exibirNome();
	}

}
