package br.com.oracle.persona;

public class jogador extends personagem {
	int pontosDeMana;
	int experienciaAtual;
	int experienciaProximoNivel;

	public jogador() {}
	
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
