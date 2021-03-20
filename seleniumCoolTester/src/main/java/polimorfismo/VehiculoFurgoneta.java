package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{

	private int carga;
	
	/**
	 * @author Manuel
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param carga
	 */
	public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.carga= carga;
		// TODO Auto-generated constructor stub
	}
	
	public int getCarga() {
		return carga;
	}
	
	@Override
	public String mostrarDatos() {

		return "Matricula " + matricula + "\n" + "Marca " + marca + "\n" + "Modelo " + modelo + "\n" + "Carga "+ carga;
	}

}
