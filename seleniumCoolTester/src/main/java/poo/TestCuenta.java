package poo;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nombre ;
		String numero;
		double tipo;
		double importe;
		
		Cuenta cuenta1 = new Cuenta();
		
		// asignar valor a las variables por consola
		
		System.out.println("Ingrese Nombre:");
		nombre = leer.next();
		
		System.out.println("Ingrese Numero de cuenta:");
		numero = leer.next();
		
		System.out.println("Ingrese tipo de interés:");
		tipo = leer.nextDouble();
		
		System.out.println("Ingrese saldo:");
		importe = leer.nextDouble();
		
		leer.close();
		
		//------- Asignar valores con los metodos set
		
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		
		System.out.println("Nombre: "+ cuenta1.getNombre());
		
		// ----- Asignar
		
		Cuenta cuenta2 = new Cuenta("Wilmer Chacon","123",11,3000);
		
		System.out.println(cuenta2.getNombre());
		
		// ------- Usar el contrctor que recibe un objeto
		
		Cuenta cuenta3 = new Cuenta(cuenta1);
		System.out.println(" Cuenta 1 Saldo = "+ cuenta1.getSaldo());
		System.out.println(" Cuenta 3 Saldo = "+ cuenta3.getSaldo());
		
		//------- Ingreso en la cuenta 1
		cuenta1.setSaldo(6000);
		System.out.println("----------------------------------");
		System.out.println(" Cuenta 1 Saldo = "+ cuenta1.getSaldo());
		System.out.println(" Cuenta 3 Saldo = "+ cuenta3.getSaldo());
		
		// -------- Datos de la cuenta 2
		System.out.println("-------------- Datos de la cuenta 2 ----------------");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());

		// -------- Datos de la cuenta 3
		System.out.println("-------------- Datos de la cuenta 3 ----------------");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
				
		// ----------- Trasnferencia -------------
		System.out.println("Efectuando Transferencia...");
		cuenta3.transferencia(cuenta2, 1000);
		System.out.println("Transferencia realizada, Mostrando nuevos saldos -------------");
		
		
		// -------- Datos de la cuenta 2
		System.out.println("-------------- Datos de la cuenta 2 ----------------");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());

		// -------- Datos de la cuenta 3
		System.out.println("-------------- Datos de la cuenta 3 ----------------");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de Interes: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());

	}// main

}// 
