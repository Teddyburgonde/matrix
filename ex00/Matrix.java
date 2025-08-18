public class Matrix {

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
}
	









































