import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhas = sc.nextInt();
		int colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Número a pesquisar:");
		int numero = sc.nextInt();
		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (numero == mat[i][j]) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Topo: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}