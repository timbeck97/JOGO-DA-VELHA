package tabuleiro;

public class Tabuleiro {
	private int[][] matriz;
	private int linha;
	private int coluna;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha=linha;
		this.coluna=coluna;
		matriz=new int[linha][coluna];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=0;
			}
		}
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	public void imprimeTabuleiro() {
		for(int i=0;i<3;i++) {
			System.out.print(3-i+" ");
			for(int j=0;j<3;j++) {
				System.out.print(imprimeValor(matriz[i][j]));
				if(j==0 ||j==1) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
		System.out.println("   a   b   c");
	}
	public String imprimeValor(int valor) {
		if(valor==0) {
			return " - ";
		}
		else if(valor==-1) {
			return " X ";
		}
		else{
			return " O ";
		}
		
	}
}
