package br.com.oracle.persona.jogador.classes;

import br.com.oracle.itens.equipamentos.armas.Escudo;
import br.com.oracle.itens.equipamentos.armas.Espada;
import br.com.oracle.persona.jogador.Jogador;

public class Guerreiro extends Jogador{
	
	public Guerreiro() {
		super(TipoClasseEnum.GUERREIRO);
	}
	private Espada espada;
	private Escudo escudo;
	

}
