public class CrossProduct {

	public static double[] crossProduct(double[] u, double[] v) {
		double x = 0;
		x = u[1] * v[2] - u[2] * v[1];
		
		double y = 0;
		y = u[2] * v[0] - u[0] * v[2];
		
		double z = 0;
		z = u[0] * v[1] - u[1] * v[0];
		
		double[] result = new double[3];
		result[0] = x;
		result[1] = y;
		result[2] = z;

		return result;
	}
	
	public static void main(String[] args) {
    	double[] u1 = {0.0, 0.0, 1.0};
    	double[] v1 = {1.0, 0.0, 0.0};
    	System.out.println(java.util.Arrays.toString(crossProduct(u1, v1)));
    	// expected : [0.0, 1.0, 0.0]

    	double[] u2 = {1.0, 2.0, 3.0};
    	double[] v2 = {4.0, 5.0, 6.0};
    	System.out.println(java.util.Arrays.toString(crossProduct(u2, v2)));
    	// expected: [-3.0, 6.0, -3.0]

    	double[] u3 = {4.0, 2.0, -3.0};
    	double[] v3 = {-2.0, -5.0, 16.0};
    	System.out.println(java.util.Arrays.toString(crossProduct(u3, v3)));
    	// expected : [17.0, -58.0, -16.0]
	}
}
