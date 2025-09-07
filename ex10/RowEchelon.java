import java.util.Arrays;

public class RowEchelon {

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
	
	public static void main(String[] args) {
        double[][] m1 = {
            {1., 0., 0.},
            {0., 1., 0.},
            {0., 0., 1.}
        };
        System.out.println(Arrays.deepToString(rowEchelon(m1)));
        // expected: [[1.0, 0.0, 0.0], [0.0, 1.0, 0.0], [0.0, 0.0, 1.0]]

        double[][] m2 = {
            {1., 2.},
            {3., 4.}
        };
        System.out.println(Arrays.deepToString(rowEchelon(m2)));
        // expected: [[1.0, 2.0], [0.0, 1.0]]
        // Mathematically -0.0 = 0.0

        double[][] m3 = {
            {1., 2.},
            {2., 4.}
        };
        System.out.println(Arrays.deepToString(rowEchelon(m3)));
        // expected: [[1.0, 2.0], [0.0, 0.0]]

        double[][] m4 = {
            {8., 5., -2., 4., 28.},
            {4., 2.5, 20., 4., -4.},
            {8., 5., 1., 4., 17.}
        };
        System.out.println(Arrays.deepToString(rowEchelon(m4)));
        // expected approx: [[1.0, 0.625, 0.0, 0.0, -12.166...],
        //                   [0.0, 0.0, 1.0, 0.0, -3.666...],
        //                   [0.0, 0.0, 0.0, 1.0, 29.5]]
    }
}
