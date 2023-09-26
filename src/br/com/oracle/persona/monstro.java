package br.com.oracle.persona;

public class monstro extends personagem{
	
	String nomeMonstro;
	
	int experiencia;
	
//fazer array de loot

	@Override
	public void exibirNome() {
		System.out.println("Monstro: " + this.retornarNome() + " Apareceu");
	}
	
}
