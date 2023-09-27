package br.com.oracle.persona.jogador.classes;

import br.com.oracle.itens.equipamentos.armas.Cajado;
import br.com.oracle.persona.jogador.Jogador;

public class Bruxo extends Jogador {

	public Bruxo() {
		super(TipoClasseEnum.BRUXO);

	}

	int pontosDeMana;
	private Cajado cajado;

}
