public class Norm {
	public static double norm1(double[] v) {

		double R = 0;
		
		for (int i = 0; i < v.length; ++i) {
			R += Math.abs(v[i]);				
		}
		return R;
	}
	
	// To raise a number to the square -> Math.pow(x, 2)
	// For the square root ->  Math.sqrt(x)
	// Euclidean distance : It is the length of the straight line between two points.
	public static double norm2(double[] v) {

		double R = 0;
		for (int i = 0; i < v.length; ++i) {
			R += Math.pow(v[i], 2);
		}
		return Math.sqrt(R);
	}

	// Takes the largest absolute value among the elements.
	public static double normInf(double[] v) {
		double R = 0;
		for (int i = 0; i < v.length; ++i) {
			double val = Math.abs(v[i]);
			if (val > R)
				R = val;
		}
		return R;
	}

	

	public static void main(String[] args) {
   		double[] u1 = {0.0, 0.0, 0.0};
    		System.out.println(norm1(u1) + ", " + norm2(u1) + ", " + normInf(u1));
    		// 0.0, 0.0, 0.0
		
		double[] u2 = {1.0, 2.0, 3.0};
		System.out.println(norm1(u2) + ", " + norm2(u2) + ", " + normInf(u2));
		// 6.0, 3.7416573867739413, 3.0

		double[] u3 = {-1.0, -2.0};
		System.out.println(norm1(u3) + ", " + norm2(u3) + ", " + normInf(u3));
		// 3.0, 2.23606797749979, 2.0
	}

}
