import java.util.Arrays;

public class VectorOperations {

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

	public static void main(String[] args) {
		double[][] vectors = { 
			{1, 0, -1},
			{2, 1, 3}, 
			{0, 4, 2} 
		};
		double[] coeffs = {2, 3, -1};
	
		System.out.println(Arrays.toString(linearCombination(vectors, coeffs)));
		// Expected: [8.0, -1.0, 5.0]
	}
}
