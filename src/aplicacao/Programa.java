package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Jogo jogo=new Jogo();
		int jogador=1;
		while(!jogo.ganhar() && !jogo.tabuleiroCheio()) {
			System.out.print("Digite a posicao: ");
			String posicao=sc.next();
			System.out.println();
			jogo.jogada(posicao, (jogador%2));
			jogador++;
			jogo.tabuleiro.imprimeTabuleiro();
			
		}
		
	}

}
