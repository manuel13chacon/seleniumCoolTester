package javabasics;

import javax.swing.JOptionPane;

public class AreaCirculo {

	// Calcular el area de un Circulo (pi*R2) -- Ingresa el area del circulo por teclado
		
	public static void main(String[] args) {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Radio "));
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es : "+ area);

	}

}
