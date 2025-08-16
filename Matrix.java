		// Crée une matrice 2×2 de type double vide (remplie de 0.0).

		//	Mets la valeur 5.0 dans la première ligne, deuxième colonne.

		//	Mets la valeur -3.0 dans la deuxième ligne, première colonne.

		//	Affiche ces deux valeurs avec System.out.println(...).

public class Matrix { 

	public static void printMatrix(double matrix[][])
    	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print( matrix[i][j]  + "\t");
	     		}
	     		System.out.println();
	   	}
	}

	public static void main(String[] args) {
			
		// 1. Crée une matrice double[3][3].
		double[][] matrix = new double [3][3]; 

		// 2. Mets la valeur 1.0 en haut à gauche (ligne 0, colonne 0).
		matrix[0][0] = 1.0;

		// 3. Mets la valeur 9.0 en bas à droite (ligne 2, colonne 2).
		
		matrix[2][2] = 9.0;

		// 4. Mets la valeur 4.5 au centre (ligne 1, colonne 1).
		
		matrix[1][1] = 4.5;
		
		// 5. Affiche toute la matrice avec ta fonction printMatrix.
		
		printMatrix(matrix);

		 
	} 

}