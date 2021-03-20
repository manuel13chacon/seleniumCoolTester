package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {
		// crear arreglo de 100 indices
		
		int [] numeros = new int [10];
		int suma = 0;
		
		// Recorrer el arreglo , asignar numero y sumar
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i]= i+1 ;
			suma += numeros[i] ; // suma = suma + numero[i] 
		}
		
		// mostrar el resultado de la suma
		System.out.println(suma);

	}

}
