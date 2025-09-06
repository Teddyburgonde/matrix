public class Trace {

	public static double trace(double[][] A) {
		if (A.length != A[0].length) {
    		throw new IllegalArgumentException("Matrix is not square");
		}
		
		double result = 0;
		
		for (int i = 0; i < A.length; i++) {
    		result += A[i][i];
		}
		return result;
	}
	
	public static void main(String[] args) {
    	double[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    	System.out.println(trace(A)); 
    	// expected : 15.0  (1 + 5 + 9)

    	double[][] B = {{2, 0}, {0, 2}};
    	System.out.println(trace(B)); 
    	// expected : 4.0  (2 + 2)

    	double[][] C = {{3, -1, 4}, {2, 5, 6}, {7, 8, 9}};
    	System.out.println(trace(C)); 
    	// expected : 17.0  (3 + 5 + 9)

    	double[][] D = {{1, 0, 0, 0}, {0, 2, 0, 0}, {0, 0, 3, 0}, {0, 0, 0, 4}};
    	System.out.println(trace(D)); 
    	// expected : 10.0  (1 + 2 + 3 + 4)
	}
}
