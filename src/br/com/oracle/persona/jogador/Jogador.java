package br.com.oracle.persona.jogador;


import br.com.oracle.itens.equipamentos.armadura.Botas;
import br.com.oracle.itens.equipamentos.armadura.Elmo;
import br.com.oracle.itens.equipamentos.armadura.Luvas;
import br.com.oracle.persona.Personagem;
import br.com.oracle.persona.jogador.classes.TipoClasseEnum;

public abstract class Jogador extends Personagem {

	private int experienciaAtual;
	private int experienciaProximoNivel;

	private Elmo elmo;
	private Armadura armadura;
	private Luvas luvas;
	private Botas botas;

	private  TipoClasseEnum classe;
	
	
	public Jogador() {
	}
	
	public Jogador(TipoClasseEnum classe) {
		this.classe = classe;
	}
	
	
	public int getExperienciaAtual() {
		return experienciaAtual;
	}

	public void setExperienciaAtual(int experienciaAtual) {
		this.experienciaAtual = experienciaAtual;
	}

	public int getExperienciaProximoNivel() {
		return experienciaProximoNivel;
	}

	public void setExperienciaProximoNivel(int experienciaProximoNivel) {
		this.experienciaProximoNivel = experienciaProximoNivel;
	}

	public Elmo getElmo() {
		return elmo;
	}

	public void setElmo(Elmo elmo) {
		this.elmo = elmo;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
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
	public void exibirNome() {
		System.out.println("Personagem " + this.retornarNome());

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

}
