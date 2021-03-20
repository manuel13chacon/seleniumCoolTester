package javabasics;

public class ArregloInvertirOrden {

	public static void main(String[] args) {
		// Creamos un arreglo de 5 indices
		
		int arreglo1 [] = {1,2,3,4,5 };
		int arreglo2 [] = new int [arreglo1.length];
		
		for (int i = (arreglo1.length-1) ,  j = 0; i >=0 ; i--, j++) {
			arreglo2[j] = arreglo1[i];
			System.out.println(arreglo2[j]);
		}
	}

}
