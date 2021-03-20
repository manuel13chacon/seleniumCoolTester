package javabasics;

import javax.swing.JOptionPane;

public class Divisible {
	
	// lee un numero por teclado e indica si es divisible entre 2 (resto = 0)
	// indicar si no lo es
	
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		if(numero %2 ==0) {
			System.out.println("Si es divisible");
		}else {
			System.out.println("No es divisible");
		}
			

	}

}
