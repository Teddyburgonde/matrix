import java.util.Arrays;

/*
for u and v 
If t = 0 ➝ you are at the beginning → result = u.
If t = 1 ➝ you are at the end → result = v.
If 0 < t < 1 ➝ you are in between, proportionally to t.
*/

public class Lerp {
	
	// The lerp gives an intermediate value between the two vectors.
	public static double[] lerpVector(double[] A, double[] B, double t) {
		if (A.length != B.length)
			throw new IllegalArgumentException("A and B must be the same length.");

		double[] R = new double[A.length]; 
	
	
		for (int i = 0; i < A.length; ++i) {
			//Formula mathematical 
			R[i] = A[i] + t * (B[i] - A[i]); 
		}
		return R;
	}
	
	// Calculates the lerp between two numbers
	public static double lerpScalar(double u, double v, double t) {
		//Formula mathematical 
		return u + t * (v - u);
	}
	// The lerp gives an intermediate value between the two matrix.
	public static double[][] lerpMatrix(double[][] A, double[][] B, double t) {
		if (A.length != B.length || A[0].length != B[0].length)
			throw new IllegalArgumentException("A and B must have the same shape.");
		double[][] R = new double[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				//Formula mathematical 
				R[i][j] = A[i][j] + t * (B[i][j] - A[i][j]);
			}
		}
		return R;
	}
	
	public static void main(String[] args) { 
		
		// Scalaire
		System.out.println(lerpScalar(0.0, 1.0, 0.0));
		// 0.0

		System.out.println(lerpScalar(0.0, 1.0, 1.0));
		// 1.0

		System.out.println(lerpScalar(0.0, 1.0, 0.5));
		// 0.5

		System.out.println(lerpScalar(21.0, 42.0, 0.3));
		// 27.3
		
		// Vectors
		double[] vA = {2.0, 1.0};
    	double[] vB = {4.0, 2.0};
    	System.out.println(Arrays.toString(lerpVector(vA, vB, 0.3)));
    	// [2.6, 1.3]

		// Matrices
    	double[][] mA = {{2.0, 1.0}, {3.0, 4.0}};
		double[][] mB = {{20.0, 10.0}, {30.0, 40.0}};
		double[][] mR = lerpMatrix(mA, mB, 0.5);
		
		// deepToString -> recursively traverse nested arrays
		System.out.println(Arrays.deepToString(mR));
		// [[11.0, 5.5], [16.5, 22.0]]
	}
}
