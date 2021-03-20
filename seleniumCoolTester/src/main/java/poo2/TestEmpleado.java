package poo2;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Wilmer");
		Directivo d1 = new Directivo("Manuel");
		Operario op1 = new Operario("Nubia");
		Oficial of1 = new Oficial("Maria");
		Tecnico t1 = new Tecnico("Jose");
		
		Empleado e2 =  new Tecnico("Fran"); // POLIMORFISMO
		
		System.out.println(e1);
		System.out.println(" ");
		System.out.println(d1);
		System.out.println(" ");
		System.out.println(op1);
		System.out.println(" ");
		System.out.println(of1);
		System.out.println(" ");
		System.out.println(t1);
		System.out.println(" ");
		System.out.println(e2);

	}

}
