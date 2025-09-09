public class Inverse {

	public static double determinant2x2(double[][] A) {

		double det = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);

		return det;
	}

	public static double determinant3x3(double[][] A) {
		double det = A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
		- A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
 		+ A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);

		return det;
	}

/*
A−1 =    1              [d -b]
	 ----------        [-c a]
	ad - bc 
*/
	public static double[][] inverse2x2(double[][] A) {

		double det = determinant2x2(A);

		if (det == 0)
			throw new IllegalArgumentException("Matrix has no inverse (det = 0)");
		double [][] inverse =new double[2][2];
		inverse[0][0] =  A[1][1] / det;
    		inverse[0][1] = -A[0][1] / det;
		inverse[1][0] = -A[1][0] / det;
		inverse[1][1] =  A[0][0] / det;
    
		return inverse;
	}

	public static double[][] inverse3x3(double[][] A) {

		double det = determinant2x2(A);
		
		if (det == 0)
			throw new IllegalArgumentException("Matrix has no inverse (det = 0)");

		double[][] cofactor = new double[3][3];

		// Calcul de la matrice des cofacteurs
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// Construire la sous-matrice 2x2
				double[][] minor = new double[2][2];
				int row = 0, col;
				for (int r = 0; r < 3; r++) {
					if (r == i)
						continue;
					col = 0;
					for (int c = 0; c < 3; c++) {
						if (c == j) 
							continue;
					minor[row][col] = A[r][c];
					col++;
					}
					row++;
				}
				// Cofacteur = signe * det(minor)
				cofactor[i][j] = Math.pow(-1, i + j) * determinant2x2(minor);
			}
 		}

		// Transposée des cofacteurs = adj(A)
		double[][] adj = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
 				adj[i][j] = cofactor[j][i];
            		}
		}

		// Inverse = (1/det) * adj(A)
 		double[][] inverse = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				inverse[i][j] = adj[i][j] / det;
			}
		}

		return inverse;
	}

	public static double[][] inverse4x4(double[][] A) {


		double det = determinant2x2(A);

		if (det == 0)
			throw new IllegalArgumentException("Matrix has no inverse (det = 0)");

 		// à compléter
		// Pour une 4×4, chaque cofacteur est un déterminant de 3×3.
	}


}