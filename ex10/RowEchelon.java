public class RowEchelon {

	public static double[][] rowEchelon(double[][] A){
	
		for (int i = 0; i < A.length; ++i) {
			double pivot = A[i][i];
			if (pivot != 0) {
				// Normalise line i so that the pivot becomes 1 
				for (int j = 0; j < A[0].length; j++) {
        			A[i][j] = A[i][j] / pivot;
    			}
			}
		}
	}

}
