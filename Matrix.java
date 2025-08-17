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



Calcule et affiche :

M × I2 (attendu = M)

I2 × M (attendu = M)

M × Z2 (attendu = Z2)

Z2 × M (attendu = Z2)

*/

// formule
// result[i][j] += A[i][k] * B[k][j];


import java.util.Arrays;

public class Matrix { 
	public static void main(String[] args) 
	{ 
		// Creation matrice

		double[][] A = {
			{1, 0, 5},
			{0, 1, 2},
			{5, 2, 4}
		};
		
		double[][] B = {
			{5, 2},
			{1, 1},
			{7, 2}
		};
		
		

		double[][] result = new double[A.length][B[0].length];
		
		for (int i = 0; i < A.length; ++i) {
			for (int j = 0; j < B[0].length; ++j) {
				for (int k = 0; k < A[0].length; ++k) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		
		

		for (int i = 0; i < result.length; ++i) {

			System.out.println(Arrays.toString(result[i]));
		}
	}
}
	









































