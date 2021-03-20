package javabasics;

import javax.swing.JOptionPane;

public class EjercicioTarea1b {

	public static void main(String[] args) {
		// 2) Crea un arreglo de Strings llenarlo y mostrar cada elemento de ese arreglo
		
		String arreglo[] = new String[5];
		
		for (int i =0 ; i< arreglo.length ; i++) {
			arreglo[i] = JOptionPane.showInputDialog("Ingrese una palabra: ");
		}
		
		for (int j =0 ; j < arreglo.length ; j++) {
			System.out.println("Palabra "+ (j+1) + " = "+ arreglo[j] ); 
		}

	}

}
