package polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("1111", "Ford", "2009");
		misVehiculos[1] = new VehiculoTurismo(8, "2222", "Audi", "2010");
		misVehiculos[2] = new VehiculoDeportivo(40, "3333", "Mazda", "2011");
		misVehiculos[3] = new VehiculoFurgoneta(700, "4444", "Toyota", "2021");
		
		
		for(Vehiculo vehiculos : misVehiculos) {
			System.out.println(vehiculos.mostrarDatos()+"\n");
		}
		
		Vehiculo vehiculoTest = new VehiculoDeportivo(20, "5555", "Renault", "2015");
		System.out.println(vehiculoTest.mostrarDatos()); 

	}

}
