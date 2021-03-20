package poo2;

public class Empleado {
	
	private String nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre ;
		System.out.println("Constructor de clase Empleado "+ nombre);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
}
