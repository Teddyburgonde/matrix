/*

u = (2, 3, 4)
v = (1, 0, -1)

pour x 
la formule : (u_y * v_z) - (u_z * v_y)
u_y = 3 u_z = 4
v_y = 0 v_z = -1

donc 3 * -1 = -3 
4 * 0 = 0
donc -3 - 0 = -3

donc x = -3 


pour y 
la formule : (u_z * v_x) - (u_x * v_z)

u_z = 3eme coordonner de u
v_x = 1ere coordonner de v
u_x = 1ere coordonner de u
v_z = 3eme coordonner de v 

donc (4 * 1) - (2 * -1) 
4 - (-2)
y = 6 

donc (-3, 6, ?)


pour z 
la formule (u_x * v_y) - (u_y * v_x)
(2 * 0 ) - ( 3 * 1) 
0 - 3
z = -3

donc (-3, 6, -3)

*/

public static double[] crossProduct(double[] u, double[] v)
