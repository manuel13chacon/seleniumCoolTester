package javabasics;

public class Cadenas {
	
	// Dad una cadena de caracteres, extraer la cuarta y quinta letra usando el metodo substring
	
	public static void main (String [] args) {
		
		String cadena = "HolA Curso selenium";
		
		String subcadena = cadena.substring(0, 5);
		
		System.out.println(subcadena);
		
		if(cadena.equals("Hola Curso Selenium")) {
			System.out.println("Cadenas Iguales");
		}else {
			System.out.println("Las cadenas no son iguales");
		}
		
		///////////////////////////////////////////////////
		
		if(cadena.equalsIgnoreCase("Hola Curso Selenium")) {
			System.out.println("Cadenas Iguales ignorando mayusculas");
		}else {
			System.out.println("Las cadenas no son iguales ignorando mayusculas");
		}
		
		/////////////////////////////////////////////////////
		
		if(cadena.contains("Hola")) {
			System.out.println("la cadena contiene el elemento buscado");
		}else {
			System.out.println("El elemento NO esta en la cadena");
		}
	}

}
