public class Cos {

	public static double norm2(double[] v) { 
	
	double R = 0; 
		for (int i = 0; i < v.length; ++i) {
			R += Math.pow(v[i], 2); 
		} 
		return Math.sqrt(R); 
	}

	public static double cosine(double[] u, double[] v) {
		double resultScalaire = 0;
		if ( u.length != v.length)
			throw new IllegalArgumentException("Incorrect vector values");
		for (int i = 0; i < u.length; ++i) {			
			resultScalaire += u[i] * v[i];
		}
		double resultFinal = resultScalaire / (norm2(u) * norm2(v));
		return resultFinal; 
	}

	public static void main(String[] args) {
 		double[] u1 = {1, 0};
		double[] v1 = {0, 1};
		System.out.println(cosine(u1, v1)); // expected : 0.0

		double[] u2 = {1, 0};
		double[] v2 = {1, 0};
		System.out.println(cosine(u2, v2)); // expected : 1.0

		double[] u3 = {1, 0};
		double[] v3 = {-1, 0};
		System.out.println(cosine(u3, v3)); // expected : -1.0
	}
}