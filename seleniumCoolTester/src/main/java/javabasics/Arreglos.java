package javabasics;

import javax.swing.JOptionPane;

public class Arreglos {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		rellenarListaDeNumeros(numeros);
		mostrarArreglo(numeros);
	
	}			
	public static void rellenarListaDeNumeros (int arreglo[] ) {
		
		for( int i=0 ; i < arreglo.length ; i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un numero");
			arreglo[i] = Integer.parseInt(texto);
		}
		
	} // end  
	
	public static void mostrarArreglo (int arreglo[] ) {
		for (int j = 0; j < arreglo.length ; j++) {
			System.out.println("El indice "+ j + " contiene el valor = "+ arreglo[j] );
		}
	} // end

}
