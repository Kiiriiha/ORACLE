package br.com.oracle.persona;

public class monstro extends personagem{
	
	
	
	int experiencia;
	
//fazer array de loot

	public monstro() { }
	
	public monstro(racas raca) {
		switch(raca) {
		case ZUMBI:
			System.out.println("Raça: Zumbi");
			break;
		case HUMANO:
			System.out.println("Raça: Humano");
			break;
			
		case ELFO :
			System.out.println("Raça: Elfo");

			break;
			
		case GOBLIN:
			System.out.println("Raça: Goblin");
			break;
			
			default:
				System.out.println("Escolha uma Raça");

				break;
		}
	}
	
	@Override
	public void exibirNome() {
		System.out.println("Monstro " + this.retornarNome() + " Apareceu");
	}
	
}
