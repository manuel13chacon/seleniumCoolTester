package javabasics;

public class EjemploWhile {

	public static void main(String[] args) {
		
		int numero = 1;
		
		while(numero <= 100) {
			System.out.println(numero);
			
			if(numero == 34) {
				break;
			}
			numero++ ;
		}
		
		//////////////////////////////////////////////
		
		for (int i =50 ; i <= 100; i++) {
			System.out.println(i);
		}

	}

}
