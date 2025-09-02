public class DocProduct {
	public static double dotProduct(double[] v1, double[] v2) {
		double dot = 0;
		for (int i = 0; i < v1.length; ++i) {
				dot += v1[i] * v2[i];
		}	
		return dot;
	}

	public static void main(String[] args) {	
		double[] u1 = {0.0, 0.0};
		double[] v1 = {1.0, 1.0};
        	System.out.println(dotProduct(u1, v1)); 
		//  0.0

		double[] u2 = {1.0, 1.0};
		double[] v2 = {1.0, 1.0};
		System.out.println(dotProduct(u2, v2)); 
		// 2.0

		double[] u3 = {-1.0, 6.0};
		double[] v3 = {3.0, 2.0};
		System.out.println(dotProduct(u3, v3)); 
		// 9.0	
	}
}