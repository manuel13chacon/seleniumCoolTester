package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

	private int cilindrada;

	/**
	 * @author Manuel
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param cilindrada
	 */
	public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}

	public int getCilindradas() {
		return cilindrada;
	}

	@Override
	public String mostrarDatos() {

		return "Matricula " + matricula + "\n" + "Marca " + marca + "\n" + "Modelo " + modelo + "\n" + "Cilindrada "+ cilindrada;
	}

}
