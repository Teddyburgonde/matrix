/*
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




Crée deux vecteurs double[] de dimension 3 :

v1=(2,4,−1)
v1=(2,4,−1)

v2=(5,0,3)
v2=(5,0,3)

Crée un troisième vecteur result qui sera la somme des deux (formule :

result[i]=v1[i]+v2[i]
result[i]=v1[i]+v2[i] ).

Affiche le résultat sous la forme :

*/



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

		

	}
}
	