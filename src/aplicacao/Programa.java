package aplicacao;

import tabuleiro.Tabuleiro;

public class Programa {

	public static void main(String[] args) {
		
		Jogo jogo=new Jogo();
		int[] teste=jogo.converteDigito('a', 1);
		jogo.tabuleiro.imprimeTabuleiro();
		System.out.println(teste[0]);
		
	}

}
