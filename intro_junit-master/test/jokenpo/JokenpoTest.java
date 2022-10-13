package jokenpo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JokenpoTest {

	private Jokenpo jogo;
	@BeforeEach
	public void inicializa() {
		jogo = new Jokenpo();
	}	
	@Test
	public void Empatepapel() {
		int jogar = jogo.jogar(1,1);
		assertTrue(jogar == 0);
	}
	@Test
	public void Empatepedra() {
		int jogar = jogo.jogar(2,2);
		assertTrue(jogar == 0);
	}
	@Test
	public void Empatetesoura() {
		int jogar = jogo.jogar(3,3);
		assertTrue(jogar == 0);
	}
	@Test
	public void Papelpedra() {
		int jogar = jogo.jogar(1,2);
		assertTrue(jogar == 1);
	}
	@Test
	public void Papeltesoura() {
		int jogar = jogo.jogar(1,3);
		assertTrue(jogar == 2);
	}
	@Test
	public void Pedrapapel() {
		int jogar = jogo.jogar(2,1);
		assertTrue(jogar == 2);
	}
	@Test
	public void Pedratesoura() {
		int jogar = jogo.jogar(2,3);
		assertTrue(jogar == 1);
	}
	@Test
	public void Tesourapapel() {
		int jogar = jogo.jogar(3,1);
		assertTrue(jogar == 1);
	}
	@Test
	public void Tesourapedra() {
		int jogar = jogo.jogar(3,2);
		assertTrue(jogar == 2);
	}
	@Test
	public void Jogador1Negativo() {
		int jogar = jogo.jogar(-1,1);
		assertTrue(jogar == -1);
	}
	@Test
	public void Jogador2Negativo() {
		int jogar = jogo.jogar(1,-1);
		assertTrue(jogar == -1);
	}
	@Test
	public void Jogador1Maiorque3() {
		int jogar = jogo.jogar(4,1);
		assertTrue(jogar == -1);
	}
	@Test
	public void Jogador2Maiorque3() {
		int jogar = jogo.jogar(1,4);
		assertTrue(jogar == -1);
	}
}
