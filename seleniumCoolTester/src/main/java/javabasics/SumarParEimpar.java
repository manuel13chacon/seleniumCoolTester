package javabasics;

import java.util.Scanner;

public class SumarParEimpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double par = 0;
		double impar = 0;
		double residuo;
		double 	numeroTemp;
		
		for(int i = 1 ; i <=5 ; i++) {
			System.out.println("Ingrese el número [ " + i + " ]");
			
			numeroTemp = teclado.nextDouble();
			
			while ( numeroTemp < 0 ) {
				System.out.println("El numero ingresado es menor que cero, favor ingrese otro numero");
				numeroTemp = teclado.nextDouble();
			}
				
			
			residuo = numeroTemp % 2 ;
			
			
			
			if(residuo == 0) {
				
				par += numeroTemp;
				System.out.println("El numero es Par: "+numeroTemp);
				
			}else if (residuo !=0 && residuo >0) {
						impar += numeroTemp;
						System.out.println("El numero es Impar: "+numeroTemp);
					}
			System.out.println( residuo);
		}
		teclado.close();
	
		
		System.out.println("La sumatoria de los numeros pares es: "+par);
		System.out.println("La sumatoria de los numeros pares es: "+impar);

	}

}
