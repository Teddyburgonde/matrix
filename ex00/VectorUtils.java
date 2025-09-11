import java.util.Arrays;

public class VectorUtils {

	public static double[] addVector(double[] v1, double[]v2) {
	
		double[] sums = new double[v1.length];
		
		for (int i = 0; i < sums.length; ++i){
			sums[i] = v1[i] + v2[i];
		}
		
		return sums;
	}
	
	public static double[] subVector(double[] v1, double[]v2) {
	
		double[] sums = new double[v1.length];
		
		for (int i = 0; i < sums.length; ++i){
			sums[i] = v1[i] - v2[i];
		}
		
		return sums;
	}
	
	public static double dotProduct(double[] v1, double[]v2) {
	
		double dot = 0;
		
		for (int i = 0; i < v1.length; ++i){
			dot += v1[i] * v2[i];
		}
		
		return dot;
	}

	public static void main(String[] args) 
	{
		// Addition 
		double[] v1 = {2, 4, -1};
		double[] v2 = {5, 0, 3};
		double[] sums1 = new double[v1.length];
		
		System.out.println(Arrays.toString(addVector(v1, v2))); 
		// expected:  [7.0, 4.0, 2.0]

		// Subtraction
		double[] v3 = {10, 8, 6};
		double[] v4 = {5, 3, 2};
		double[] sums2 = new double[v1.length];
		
		System.out.println(Arrays.toString(subVector(v3, v4))); 
		// expected: [5.0, 5.0, 4.0]
		
		// Scalar product
		double[] v5 = {10, 8, 6};
		double[] v6 = {5, 3, 2};
		
		System.out.println(dotProduct(v5, v6)); 
		// expected: 86.0
	}
}








































