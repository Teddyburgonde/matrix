import java.util.Arrays;

public class Lerp {
	
	// Vector
	public static double[] lerp(double[] A, double[] B, double t) {
		if (A.length != B.length)
			throw new IllegalArgumentException("A and B must be the same length.");

		double[] R = new double[A.length]; 
	
	
		for (int i = 0; i < A.length; ++i) {
			//3. Formula mathematical 
			R[i] = A[i] + t * (B[i] - A[i]); 
		}
		return R;
	}
	
	// Scalaire
	public static double lerp(double u, double v, double t) {
		return u + t * (v - u);
	}
	
	// Matrix
	public static double[][] lerp(double[][] A, double[][] B, double t) {
    		if (A.length != B.length || A[0].length != B[0].length)
        		throw new IllegalArgumentException("A and B must have the same shape.");
		double[][] R = new double[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				R[i][j] = A[i][j] + t * (B[i][j] - A[i][j]);
        		}
		}
		return R;
	}
	
	public static void main(String[] args) { 
		
		// Scalaire
		System.out.println(lerp(0.0, 1.0, 0.0));
		// 0.0

		System.out.println(lerp(0.0, 1.0, 1.0));
		// 1.0

		System.out.println(lerp(0.0, 1.0, 0.5));
		// 0.5

		System.out.println(lerp(21.0, 42.0, 0.3));
		// 27.3
		
		// Vectors
		double[] vA = {2.0, 1.0};
    		double[] vB = {4.0, 2.0};
    		System.out.println(Arrays.toString(lerp(vA, vB, 0.3)));
    		// [2.6, 1.3]

		 // Matrices
    		double[][] mA = {{2.0, 1.0}, {3.0, 4.0}};
		double[][] mB = {{20.0, 10.0}, {30.0, 40.0}};
		double[][] mR = lerp(mA, mB, 0.5);
		
		// deepToString -> recursively traverse nested arrays
		System.out.println(Arrays.deepToString(mR));
		// [[11.0, 5.5], [16.5, 22.0]]
	}
}
