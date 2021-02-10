package aplicacao;

import tabuleiro.Tabuleiro;

public class Jogo {
		Tabuleiro tabuleiro;
	public Jogo() {
		tabuleiro=new Tabuleiro(3, 3);
	}
	
	
	public int[] converteDigito(String posicao) {
		
		int linha1=Integer.parseInt(posicao.substring(1));
		char coluna1=posicao.charAt(0);
		int[] aux=new int[2];
		aux[0]=(int)coluna1-'a';
		aux[1]=3-linha1;
		return aux;
	}
	
	public void jogada(String posicao, int jogador) {
		int[] x=converteDigito(posicao);
		if(jogador==1) {
			tabuleiro.getMatriz()[x[1]][x[0]]=-1;
		}
		else {
			tabuleiro.getMatriz()[x[1]][x[0]]=1;
			}
	}
	public boolean ganhar() {
		if(horizontal()!=0 || vertical()!=0 || diagonal()!=0) {
			if(horizontal()==1|| vertical()==1 ||diagonal()==1) {
				System.out.println("\n\nJogador 1 ganhou!!");
				return true;
			}
			else
			{
				System.out.println("\n\nJogador 2 ganhou!!");
				return true;
			}
		}
		else {
			return false;
		}
		
	}
	public int horizontal() {
		int[][]aux=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				aux[i][j]=tabuleiro.getMatriz()[i][j];
			}
		}
		if(aux[0][1]+aux[0][1]+aux[0][2]==-3 ||aux[1][1]+aux[1][1]+aux[1][2]==-3 || aux[2][0]+aux[2][1]+aux[2][2]==-3 ) {
			//System.out.println("\n\nO JOGADOR NUMERO 1 GANHOU");
			return 1;
		}
		else if(aux[0][1]+aux[0][1]+aux[0][2]==3 ||aux[1][1]+aux[1][1]+aux[1][2]==3 || aux[2][0]+aux[2][1]+aux[2][2]==3 ) {
			//System.out.println("\n\nO JOGADOR NUMERO 2 GANHOU");
			return 2;
		}
		else
		{
			return 0;
		}
		
		
	}
	public int vertical() {
		int[][]aux=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				aux[i][j]=tabuleiro.getMatriz()[i][j];
			}
		}
		if(aux[0][0]+aux[1][0]+aux[2][0]==-3 ||aux[0][1]+aux[1][1]+aux[2][1]==-3 || aux[0][2]+aux[1][2]+aux[2][2]==-3 ) {
			//System.out.println("\n\nO JOGADOR NUMERO 1 GANHOU");
			return 1;
		}
		else if(aux[0][0]+aux[1][0]+aux[2][0]==3 ||aux[0][1]+aux[1][1]+aux[2][1]==3 || aux[0][2]+aux[1][2]+aux[2][2]==3 ) {
			//System.out.println("\n\nO JOGADOR NUMERO 2 GANHOU");
			return 2;
		}
		else
		{
			return 0;
		}
		
		
	}
	public int diagonal ()
	{
		int[][]aux=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				aux[i][j]=tabuleiro.getMatriz()[i][j];
			}
		}
		if(aux[0][0]+aux[1][1]+aux[2][2]==-3 || aux[0][2]+aux[1][1]+aux[2][0]==-3 ) {
			return 1;
		}
		else if(aux[0][0]+aux[1][1]+aux[2][2]==3 || aux[0][2]+aux[1][1]+aux[2][0]==3 ) {
			return 2;
		}
		else {
			return 0;
		}
	}
}	
