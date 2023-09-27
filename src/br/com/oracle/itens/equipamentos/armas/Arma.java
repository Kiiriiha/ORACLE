package br.com.oracle.itens.equipamentos.armas;

import br.com.oracle.itens.equipamentos.Equipamento;

public abstract class Arma extends Equipamento{
private TipoArmaEnum tipoArma;
	
	public Arma(TipoArmaEnum tipoArma) {
		this.tipoArma = tipoArma;
	}

}
