package javabasics;

public class Metodos {

	int num1 , num2 , num3;
	
	public Metodos(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void mensajeBienvenida() {
		System.out.println("Bienvenido a su curso de Selenium");
	}
	
	public int sumatoria() {
		return num1 + num2;
	}
	
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}

}
