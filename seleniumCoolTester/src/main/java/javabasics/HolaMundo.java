package javabasics;

public class HolaMundo {
	
	String miNombre = "Wilmer Enmanuel Chacon";
	int edad = 29;
	float edadConDecimal = (float) 29.0;
	double edadConDouble = 29.00;
	char letra = 'M';
	boolean flag = true;
	
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		double num1 = 500.0024;
		double num2 = 64.47;
		double result = num1 + num2;

		System.out.println("El resultado de la suma es: " + result);
		System.out.println("El resultado de la suma es: " + (num1 + num2));
	}

}
