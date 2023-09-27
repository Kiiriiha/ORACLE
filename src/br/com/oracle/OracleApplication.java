package br.com.oracle;

import br.com.oracle.persona.inimigos.Inimigo;
import br.com.oracle.persona.inimigos.InimigosFactory;
import br.com.oracle.persona.inimigos.RacasEnum;


public class OracleApplication {

	public static void main(String[] args) {
	
		Inimigo npc = InimigosFactory.retornarNovoInimigo(RacasEnum.ELFO);
		
		
	}
}
