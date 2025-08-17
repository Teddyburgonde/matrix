/*

	public static void printMatrix(double matrix[][])
    {
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print( matrix[i][j]  + "\t");
	     		}
	     		System.out.println();
	   	}
	}




Prochain mini-exercice (très simple) — c * M

Garde m1 comme dans ton code.

Crée double c = 2.0;

Crée double[][] scaled = new double[2][2];

Remplis scaled[i][j] = c * m1[i][j];

Affiche scaled (attendu) :

2.0   4.0
6.0   8.0

*/


import java.util.Arrays;

public class Matrix { 
	public static void printMatrix(double matrix[][])
    {
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print( matrix[i][j]  + "\t");
	     		}
	     		System.out.println();
	   	}
	}
	public static void main(String[] args) 
	{ 
		double[][] m1 = { 
			{1, 2},
			{3, 4}
		};
		
		double c = 2.0;
		
		double[][] scaled = new double[2][2];
		
		for (int i = 0; i < m1.length; ++i) {
			for (int j = 0; j < m1[i].length; ++j){
				scaled[i][j] = c * m1[i][j];
			}
		}
		printMatrix(scaled); 
	}
}
	
