import java.util.Arrays;

public class Transpose {

	// We swap the rows and columns.
	public static double[][] transpose(double[][] A) {
		double[][] T = new double[A[0].length][A.length];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; ++j) {
				T[j][i] = A[i][j];
			}
			
		}
		return T;
	}

	public static void main(String[] args) {
		
		double[][] A = {
			{1, 2, 3},
      			{4, 5, 6}
		};
		
		System.out.println(Arrays.deepToString(transpose(A)));
		// [[1.0, 4.0], [2.0, 5.0], [3.0, 6.0]]
	}

}