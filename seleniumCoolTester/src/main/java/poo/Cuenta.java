package poo;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	/**
	 * @author Wilmer Chacon
	 * @date 06-03-2021
	 * @param N/A
	 **/
	
	public Cuenta() {
	}
	
	
	/**
	 * @author Wilmer Chacon
	 * @date 06-03-2021
	 * @param String String double double
	 **/
	
	public Cuenta(String nombre , String numeroCuenta ,double tipoInteres,double saldo ) {
		this.nombre= nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	/**
	 * @author Wilmer Chacon
	 * @date 06-03-2021
	 * @param Object
	 **/
	
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo ;
	}
	
	//--------------------- Metodos SET
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//---------------------- Metodos GET
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//-------------------------
	
	public boolean ingreso (double n ) {
		boolean ingresoCorrecto = true;
		
		if(n < 0 ) {
			ingresoCorrecto = false;
		}else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}
	
	public boolean reintegro(double n ) {
		boolean reintegroCorrecto = true;
		
		if(n < 0) {
			reintegroCorrecto = false;
			
		}else if (saldo >= n) {
			saldo -= n;
		}else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}

		return correcto;
	}

}
