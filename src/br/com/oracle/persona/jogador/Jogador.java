package br.com.oracle.persona.jogador;

import br.com.oracle.atributos.personagem.jogador.AtributosJogador;
import br.com.oracle.itens.equipamentos.armadura.Botas;
import br.com.oracle.itens.equipamentos.armadura.Elmo;
import br.com.oracle.itens.equipamentos.armadura.Luvas;
import br.com.oracle.itens.equipamentos.armadura.Peitoral;
import br.com.oracle.persona.Personagem;
import br.com.oracle.persona.jogador.classes.TipoClasseEnum;

public abstract class Jogador extends Personagem {

	public Jogador(TipoClasseEnum classe) {
		this.classe = classe;
	}

	public Jogador() {
	}

	private AtributosJogador atributos;
	private TipoClasseEnum classe;

	private Elmo elmo;
	private Peitoral peitoral;
	private Luvas luvas;
	private Botas botas;



	public Peitoral getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(Peitoral peitoral) {
		this.peitoral = peitoral;
	}

	public Elmo getElmo() {
		return elmo;
	}

	public void setElmo(Elmo elmo) {
		this.elmo = elmo;
	}

	public Luvas getLuvas() {
		return luvas;
	}

	public void setLuvas(Luvas luvas) {
		this.luvas = luvas;
	}

	public Botas getBotas() {
		return botas;
	}

	public void setBotas(Botas botas) {
		this.botas = botas;
	}

	public TipoClasseEnum getClasse() {
		return classe;
	}

	public void setClasse(TipoClasseEnum classe) {
		this.classe = classe;
	}

	

	@Override
	public void atacar() {

	}

	@Override
	public void defender() {

	}

	@Override
	public void usarMagia() {

	}

	public AtributosJogador getAtributos() {
		return atributos;
	}

	public void setAtributos(AtributosJogador atributos) {
		this.atributos = atributos;
	}

}
