package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {
		
	/*	Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese la primera palabra:");		
		String palabra1 = leer.next();
		
		System.out.println("Ingrese la segunda palabra:");		
		String palabra2 = leer.next();
		leer.close();
		
		System.out.println(palabra1 + " " + palabra2);
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las 2 palabras ingresadas son iguales, ignorando mayúsculas");
		}else {
			System.out.println("Las 2 palabras ingresadas NO son iguales, ignorando mayúsculas");
		}
	*/
		/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		String texto = "esto es una cadena de 7 caracteres";
		String textoSinEspacios = texto.replace(" ", "");
		System.out.println(textoSinEspacios);
		
		String textoSinNumeros = texto.replace( "\\d", "");
		System.out.println(textoSinNumeros);
		
		System.out.println("El largo de la cadena es: " + texto.length() + " caractesres");
	}

}
