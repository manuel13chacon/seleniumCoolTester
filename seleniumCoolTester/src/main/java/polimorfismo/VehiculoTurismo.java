package polimorfismo;

public class VehiculoTurismo extends Vehiculo{

	private int numPuertas;
	
	/**
	 * @author Manuel
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param numPuertas
	 */
	public VehiculoTurismo(int numPuertas,String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numPuertas = numPuertas;
		// TODO Auto-generated constructor stub
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}
	
	
	@Override
	public String mostrarDatos() {
		
		return "Matricula " +matricula+ "\n" + "Marca " +marca+ "\n"+ "Modelo " + modelo + "\n"+ "Numero de Puertas " +numPuertas;
	}

}
