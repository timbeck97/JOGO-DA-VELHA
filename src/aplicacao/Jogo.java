package aplicacao;

import tabuleiro.Tabuleiro;

public class Jogo {
		Tabuleiro tabuleiro;
	public Jogo() {
		tabuleiro=new Tabuleiro(3, 3);
	}
	
	
	public int[] converteDigito(char coluna, int linha) {
		int[] aux=new int[2];
		aux[0]='a'-(int)coluna;
		aux[1]=3-linha;
		return aux;
	}
	
	public void jogada(char coluna, int linha, int jogador) {
		int[] x=converteDigito(coluna, linha);
		if(jogador==1) {
			tabuleiro.getMatriz()[x[1]][x[0]]=-1;
		}
		else {
			tabuleiro.getMatriz()[x[1]][x[0]]=-1;
			}
	}
}
