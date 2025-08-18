public class Matrix {

	public static double[] linearCombination(double[][] vectors, double[] coeffs)
	{
		double[] result = new double[vectors[0].length];
		
		for (int i = 0; i < vectors[0].length; ++i) { 
			for (int j = 0; j < vectors.length; ++j) { 
				result[i] += coeffs[j] * vectors[j][i]; 
			} 
		}
		
		return result;
	}
}
