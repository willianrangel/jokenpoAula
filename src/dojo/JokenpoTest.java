package dojo;

import static org.junit.Assert.*;

import org.junit.Test;



public class JokenpoTest {
	
	
	
	@Test
	public void jokenpoPedraGanhaP1(){
		assertEquals(resultado.player1, Jokenpo.jokenpo(jogo.pedra, jogo.tesoura));
		
	}
	@Test
	public void jokenpoPapelGanhaP1(){
		assertEquals(resultado.player1, Jokenpo.jokenpo(jogo.papel, jogo.pedra));
	}
	@Test
	public void jokenpoTesouraGanhaP1(){
		assertEquals(resultado.player1, Jokenpo.jokenpo(jogo.tesoura, jogo.papel));
	}
	@Test
	public void jokenpoEmpate(){
		assertEquals(resultado.empate, Jokenpo.jokenpo(jogo.tesoura, jogo.tesoura));
	}
	

}