package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {
	
	
	
	public static void main (String[] args) {
		
		//double numero0 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero "));
		
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero "));
		
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa otro numero"));
		
		//Suma
		System.out.println("La suma es "+ (numero1+numero2));		
		JOptionPane.showMessageDialog(null, "La suma es " + (numero1+numero2));
		
		//Resta
		System.out.println("La resta es " + (numero1-numero2));		
		JOptionPane.showMessageDialog(null, "La resta es " + (numero1-numero2));
		
		//Multiplicaci�n
		System.out.println("La multiplicaci�n es " + (numero1*numero2));		
		JOptionPane.showMessageDialog(null, "La multiplicaci�n es " + (numero1*numero2));
		
		//Divisi�n
		System.out.println("La divisi�n es " + (numero1/numero2));		
		JOptionPane.showMessageDialog(null, "La divisi�n es " + (numero1/numero2));
	}

}
