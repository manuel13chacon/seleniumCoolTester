package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeEnteros {

	public static void main(String[] args) {
		// Declarar la lista de enteros
		
		List <Integer> listaDeNumeros  = new ArrayList <> ();
		
		listaDeNumeros.add(100);
		listaDeNumeros.add(20);
		listaDeNumeros.add(3);
		listaDeNumeros.add(20);
		listaDeNumeros.add(8);
		listaDeNumeros.add(5);
		listaDeNumeros.add(20);
		listaDeNumeros.add(20);
		
		System.out.println(listaDeNumeros);
		
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		System.out.println(listaDeNumeros);
		
		Collections.sort(listaDeNumeros);
		
		//object last = null;
		
		int numRepetidos = 0;
		
		//iterator <integer> 
	
	
	}// Main

}// Class
