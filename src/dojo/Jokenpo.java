package dojo;
enum jogo {
	pedra, papel, tesoura
}
enum resultado {
	player1, player2, empate
}

public class Jokenpo {

	public static resultado jokenpo(jogo jogadaP1, jogo jogadaP2){
		if(jogadaP1 == jogadaP2)
			return resultado.empate;
		
	switch(jogadaP1){
		case pedra:
				if(jogadaP2 == jogo.papel) return resultado.player2;
				break;
		case tesoura:
				if(jogadaP2 == jogo.pedra) return resultado.player2;
				break;
		case papel:
				if(jogadaP2 == jogo.tesoura) return resultado.player2;
				break;
		}
		
		return resultado.player1;
	}
}