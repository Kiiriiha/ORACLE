package br.com.oracle.persona;

public class jogador extends personagem {
	int pontosDeMana;
	int experienciaAtual;
	int experienciaProximoNivel;

	
	
	@Override
public void exibirNome() {
		System.out.println("Nome: " + this.retornarNome());
	
}



}
