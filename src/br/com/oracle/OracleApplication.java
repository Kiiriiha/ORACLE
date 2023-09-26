package br.com.oracle;

import br.com.oracle.persona.racas;
import br.com.oracle.persona.inimigos.Inimigo;
import br.com.oracle.persona.inimigos.InimigosFactory;


public class OracleApplication {

	public static void main(String[] args) {
	
		Inimigo npc = new InimigosFactory().retornarNovoInimigo(racas.ELFO);
		
		
	}
}
