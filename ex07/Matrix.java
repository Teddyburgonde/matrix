import java.util.Arrays;

public class Matrix {
	
	private double[][] matrice;
	private int cols;
	private int rows;
	
	public Matrix(double[][] matrice) {
		this.matrice = matrice;
		this.rows = matrice.length;
		this.cols = matrice[0].length;
	}

	// -------- Matrix × Vector --------
	public double[] mulVec(double[] u) {
		if (u.length != this.cols)
			throw new IllegalArgumentException("Vector size does not match matrix columns");
		
		double[] result = new double[this.rows];
		
		for (int i = 0; i < rows; ++i) {
			double somme = 0;
			for (int j = 0; j < cols; ++j) {
				somme += matrice[i][j] * u[j];
			}
			result[i] = somme;
		}
		return result;
	}

	// -------- Matrix × Matrix --------
	public Matrix mulMat(Matrix other) {
		if (this.cols != other.rows)
			throw new IllegalArgumentException("Matrix dimensions do not match for multiplication");
		
		double[][] result = new double[this.rows][other.cols];
		
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < other.cols; j++) {
				double sum = 0;
				for (int k = 0; k < this.cols; k++) {
					sum += this.matrice[i][k] * other.matrice[k][j];
				}
				result[i][j] = sum;
			}
		}
		return new Matrix(result);
	}

	public double[][] getData() {
		return matrice;
	}

	// -------- Main de test --------
	public static void main(String[] args) {
		// ---- Matrix × Vector ----
 		double[][] m1 = {{1, 0}, {0, 1}};
	    	double[] v1 = {4, 2};
    		Matrix A1 = new Matrix(m1);
    		System.out.println(Arrays.toString(A1.mulVec(v1)));
    		// expected : [4.0, 2.0]

		double[][] m2 = {{2, 0}, {0, 2}};
		double[] v2 = {4, 2};
		Matrix A2 = new Matrix(m2);
		System.out.println(Arrays.toString(A2.mulVec(v2)));
    		// expected : [8.0, 4.0]

		double[][] m3 = {{2, -2}, {-2, 2}};
		double[] v3 = {4, 2};
		Matrix A3 = new Matrix(m3);
		System.out.println(Arrays.toString(A3.mulVec(v3)));
		// expected : [4.0, -4.0]

		// ---- Matrix × Matrix ----
		double[][] m4 = {{1, 0}, {0, 1}};
		double[][] n4 = {{1, 0}, {0, 1}};
		Matrix B1 = new Matrix(m4);
		System.out.println(Arrays.deepToString(B1.mulMat(new Matrix(n4)).getData()));
		// expected : [[1.0, 0.0], [0.0, 1.0]]

		double[][] m5 = {{1, 0}, {0, 1}};
		double[][] n5 = {{2, 1}, {4, 2}};
		Matrix B2 = new Matrix(m5);
		System.out.println(Arrays.deepToString(B2.mulMat(new Matrix(n5)).getData()));
		// expected : [[2.0, 1.0], [4.0, 2.0]]

		double[][] m6 = {{3, -5}, {6, 8}};
		double[][] n6 = {{2, 1}, {4, 2}};
		Matrix B3 = new Matrix(m6);
		System.out.println(Arrays.deepToString(B3.mulMat(new Matrix(n6)).getData()));
		// expected : [[-14.0, -7.0], [44.0, 22.0]]
	}
}

