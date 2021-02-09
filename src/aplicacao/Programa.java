package aplicacao;

import tabuleiro.Tabuleiro;

public class Programa {

	public static void main(String[] args) {
		
		Jogo jogo=new Jogo();
		jogo.jogada('a', 2, 1);
		System.out.println();
		jogo.tabuleiro.imprimeTabuleiro();
		
	}

}
