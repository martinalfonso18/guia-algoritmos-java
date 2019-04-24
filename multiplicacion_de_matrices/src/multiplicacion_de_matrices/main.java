/*
 * Codifique un programa para la multiplicación de dos matrices de números flotantes.
 */
package multiplicacion_de_matrices;

import javax.swing.JOptionPane;

public class main {
	
	public static int dimension;
	
	public static void main(String[] args) {
		definirDimension();
		
		int a[][] = new int[dimension][dimension];
		int b[][] = new int[dimension][dimension];
		int c[][] = new int[dimension][dimension];
		
		llenarMatrices(a,b,dimension);
		multiplicar(a,b,c,dimension);
		mostrarMatrices(c,dimension);
		
	}
	
	public static void definirDimension() {
		dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension de las matrices: "));
	}
	
	public static void llenarMatrices(int x[][], int y[][], int d) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<d;j++) {
				x[i][j] = (int)(Math.random()*50 + 1);
			}
		}
	}
	
	public static void multiplicar(int x[][], int y[][], int z[][], int d) {
		x = new int[d][d];
		y = new int[d][d];
		z = new int[d][d];
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				z[i][j] = x[i][j] * y[i][j];
			}
		}
	}
	public static void mostrarMatrices(int z[][], int d) {
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				System.out.println(z[i][j]);
			}
		}
	}
}
