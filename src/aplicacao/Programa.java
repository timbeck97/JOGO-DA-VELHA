package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Jogo jogo=new Jogo();
		/*jogo.jogada('a', 1, 2);
		jogo.jogada('b', 1, 2);
		jogo.jogada('c', 1, 2); */
		int jogador=1;
		while(!jogo.ganhar()) {
			
			String posicao=sc.next();
			jogo.jogada(posicao, (jogador%2));
			jogador++;
			jogo.tabuleiro.imprimeTabuleiro();
			
		}
		
	}

}
