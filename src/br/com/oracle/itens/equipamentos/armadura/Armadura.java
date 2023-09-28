package br.com.oracle.itens.equipamentos.armadura;

import br.com.oracle.itens.equipamentos.Equipamento;

public abstract class Armadura extends Equipamento {

	private TipoArmaduraEnum tipoArmadura;
	
	public Armadura(TipoArmaduraEnum tipoArmadura) {
		this.tipoArmadura = tipoArmadura;
	}

	public TipoArmaduraEnum getTipoArmadura() {
		return tipoArmadura;
	}

	public void setTipoArmadura(TipoArmaduraEnum tipoArmadura) {
		this.tipoArmadura = tipoArmadura;
	}
	
}
