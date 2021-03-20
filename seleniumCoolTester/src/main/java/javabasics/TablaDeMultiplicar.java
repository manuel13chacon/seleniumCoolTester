package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// Ingresar un numero y multiplicarlo del 1 al 10
				
		Scanner leer = new Scanner(System.in);
		int numero ;
		int resultado;
		
		System.out.println("Ingrese el numero que quieres multiplicar ");
		numero = leer.nextInt();
		
		while (numero <0) {
			System.out.println("Favor Ingrese un numero mayor a cero (0), Ingrese el numero nuevamente ");
			numero = leer.nextInt();
		}//end while
		
		leer.close();
		
		System.out.println("La tabla de Multiplicar del "+ numero + " es: ");
		for (int i = 1 ; i <= 10 ; i++) {
			
			resultado = numero * i ;
			System.out.println( numero + " * " + i + " = "+ resultado);
			
		}//end for

	} //end main

}// end class
