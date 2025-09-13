import java.util.Arrays;


/*
The determinant is used to determine whether a square matrix is invertible: 
if the determinant ≠ 0, it is invertible; otherwise, it is not.
*/

public class Determinant {
	
	// det = ad - bc
	public static double determinant2x2(double[][] A) {

		double det = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);

		return det;
	}
	
	// det(A) = a(ei - fh) - b(di - fg) + c(dh-eg);
	public static double determinant3x3(double[][] A) {
		
	double det = A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
           - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
           + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
		
		return det;
	}

	public static double determinant4x4(double[][] A) {
	
		double det = 0;

		// Expansion par cofacteurs sur la 1ère ligne
		for (int col = 0; col < 4; col++) {
        		// Construire la sous-matrice 3x3
			double[][] subMatrix = new double[3][3];
			for (int i = 1; i < 4; i++) { // saute la première ligne
				int subCol = 0;
				for (int j = 0; j < 4; j++) {
					if (j == col) 
						continue; // saute la colonne du pivot
					subMatrix[i - 1][subCol] = A[i][j];
					subCol++;
				}
        	}

 			double sign;
			if (col % 2 == 0)
				sign = 1;
			else
				sign = -1;
			det += sign * A[0][col] * determinant3x3(subMatrix);
		}
		return det;
	}

	public static double determinant(double[][] A) {
		int n = A.length;
		if (n != A[0].length)
			throw new IllegalArgumentException("Matrix must be square");
		if (n == 2) 
			return determinant2x2(A);
		if (n == 3) 
			return determinant3x3(A);
		if (n == 4) 
			return determinant4x4(A);
		throw new IllegalArgumentException("Only 2x2, 3x3 or 4x4 supported");
	}

	public static void main(String[] args) {
		double[][] m1 = {
			{1.0, -1.0},
			{-1.0, 1.0}
		};
		System.out.println(determinant(m1));
		// expected : 0.0

		double[][] m2 = {
			{2.0, 0.0, 0.0},
			{0.0, 2.0, 0.0},
			{0.0, 0.0, 2.0}
		};
		System.out.println(determinant(m2));
		// expected : 8.0

		double[][] m3 = {
			{8.0, 5.0, -2.0},
			{4.0, 7.0, 20.0},
			{7.0, 6.0, 1.0}
		};
		System.out.println(determinant(m3));
		// expected : -174.0

		double[][] m4 = {
			{8.0, 5.0, -2.0, 4.0},
			{4.0, 2.5, 20.0, 4.0},
			{8.0, 5.0, 1.0, 4.0},
			{28.0, -4.0, 17.0, 1.0}
		};
		System.out.println(determinant(m4));
		// expected : 1032.0
	}
}

