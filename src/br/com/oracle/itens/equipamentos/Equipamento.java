package br.com.oracle.itens.equipamentos;

import br.com.oracle.atributos.equipamentos.AtributosEquipamento;

public abstract class Equipamento {
	
AtributosEquipamento atributos;

public AtributosEquipamento getAtributos() {
	return atributos;
}

public void setAtributos(AtributosEquipamento atributos) {
	this.atributos = atributos;
}

}
