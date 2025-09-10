public class Rank {

	public static double[][] rowEchelon(double[][] A){	
		for (int i = 0; i < A.length; ++i) {
			double pivot = A[i][i];
			if (pivot != 0) {
				// Normalise line i so that the pivot becomes 1 
				for (int j = 0; j < A[0].length; j++) {
        				A[i][j] = A[i][j] / pivot;
    				}
    				for (int k = i + 1; k < A.length; ++k) {
    					double factor = A[k][i];
    					for (int j = 0; j < A[0].length; ++j) {
    						A[k][j] = A[k][j] - factor * A[i][j];
    					}
    				}
			}
		}
		return A;
	}

	public static int rank(double[][] A) {

		double[][] echelon = rowEchelon(A);
		int rank = 0;
		
		for (int i = 0; i < echelon.length; i++) {
			boolean nonZeroRow = false;
			for (int j = 0; j < echelon[0].length; j++) {
					// tolérance pour éviter les erreurs numériques
					if (Math.abs(echelon[i][j]) > 1e-9) 
					{
                				nonZeroRow = true;
						break;
					}
			}
			if (nonZeroRow) 
				rank++;
		}
		return rank;
	}

	public static void main(String[] args) {
		// Exemple 1 : Matrice identité 3x3
		double[][] m1 = {
		{1., 0., 0.},
		{0., 1., 0.},
		{0., 0., 1.} };
		System.out.println(rank(m1)); 
		// expected: 3

		double[][] m2 = {
            	{1., 2.},
            	{3., 4.} };
		System.out.println(rank(m2));
        	// expected: 2

		double[][] m3 = {
		{1., 2.},
		{2., 4.} };
		System.out.println(rank(m3));
		// expected: 1

		double[][] m4 = {
		{1., 2., 3.},
		{0., 0., 0.},
		{4., 5., 6.} };
		System.out.println(rank(m4));
		// expected: 2
	}
}
