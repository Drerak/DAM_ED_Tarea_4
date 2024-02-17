package cuentas;

/** 
 * Ingreso comentarios
 * en la clase CCuenta
 */

public class CCuenta {

	/**
	 *	creo los atributos de la clase ccuenta 
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor sin atributos ninguno
     */

    public CCuenta()
    {
    }
    
    /**
     * Constructor con atributos
     * @param nom parámetro de nombre 
     * @param cue parámetro de cuenta
     * @param sal parámetro de saldo
     * @param tipo parámetro para el típo de interés
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * obtener nombre
     * @return nombre
     */

    public String getNombre() {
		return nombre;
	}
    
    /**
     * establecer variable nombre
     * @param nombre
     */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * obtener cuenta
	 * @return cuenta
	 */

	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * establecer cuenta
	 * @param cuenta
	 */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**3
	 * obtener saldo de la cuenta
	 * @return saldo
	 */

	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * establecer saldo de la cuenta
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * obtener tipo de interés
	 * @return entero tipoInteres
	 */

	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * establecer el tipo de interés
	 * @param tipoInterés
	 */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * método que devuelve el saldo de la cuenta
	 * @return saldo
	 */

	public double estado()
    {
        return saldo;
    }
	
	/**
	 * ingresso de dinero en la cuenta
	 * si es mayor que 0 sumará la cantidad que ingresemos si no, dará un error y mostrará la excepción
	 * @param cantidad
	 * @throws Exception
	 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar dinero, si ingresamos menos o igual a 0, dará un error
     * si en la cuenta hay menos saldo que lo que queremos extraer, dará error
     * si todo está correcto, extraerá la cantidad y se la restará al saldo
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
