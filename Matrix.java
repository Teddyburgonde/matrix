/*

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




Prochain mini-exercice (très simple) — c * M

Garde m1 comme dans ton code.

Crée double c = 2.0;

Crée double[][] scaled = new double[2][2];

Remplis scaled[i][j] = c * m1[i][j];

Affiche scaled (attendu) :

2.0   4.0
6.0   8.0

//////

Soit la matrice 2×2 et le vecteur 2×1 :

M=[1 2]
     [3 4]
 
v=[5]
     [6​]

Le produit  M×v donne :

[1×5+2×6]            = [17]
[3×5+4×6]               [39]
39]

Étapes à coder en Java :

Créer la matrice M et le vecteur v. OK

Créer un vecteur result de même taille que v.

Utiliser une boucle sur les lignes de la matrice :

pour chaque ligne i, calculer la somme des m[i][j] * v[j].

Afficher le vecteur résultat.






//////

*/




import java.util.Arrays;

public class Matrix { 
	public static void main(String[] args) 
	{ 
		double[][] m1 = {
			{1, 2},
			{3, 4}
		};
		
		double[] v1 = {5, 6};

		double [] result = new double[v1.length];

		for (int i = 0; i < m1.length; i++)
		{
			for (int j = 0; j < m1[i].length; j++)
			{
				result[i] += m1[i][j] * v1[j];
	     		}
	   	}
		System.out.println(Arrays.toString(result));
				

	}
}
	









































