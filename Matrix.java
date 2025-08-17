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



*/

// formule
// result[i][j] += A[i][k] * B[k][j];


import java.util.Arrays;

public class Matrix { 
	public static void main(String[] args) 
	{ 
		// Creation de deux matrices 

		double[][] m1 = {
			{2, 3},
			{1, 4}
		};

		double[][] m2 = {
			{5, 6},
			{7, 8}
		};

		double[][] result = new double[2][2];

		for (int i = 0; i < m1.length; ++i) {
			for (int j = 0; j < m2[0].length; ++j) {
				for (int k = 0; k < m1[0].length; ++k) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		

		for (int i = 0; i < result.length; ++i) {

			System.out.println(Arrays.toString(result[i]));
		}
	}
}
	









































