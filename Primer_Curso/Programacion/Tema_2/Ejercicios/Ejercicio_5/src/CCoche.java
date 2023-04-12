/**
 * Clase que representa un coche.
 */

public class CCoche {
	private String marca;
	private String modelo;
	private String color;
	private int velocidad;
	private static final int VELOCIDAD_MAXIMA = 120; // Constante para la velocidad máxima
	private boolean motorEncendido;
	
	/**
	 * Constructor de la clase CCoche.
	 *
	 * @param marca  Marca del coche.
	 * @param modelo Modelo del coche.
	 * @param color  Color del coche.
	 */
	public CCoche (String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
		this.motorEncendido = false;
	}
	
	/**
	 * Retorna la marca del coche
	 *
	 * @return la marca del coche
	 */
	public String getMarca () {
		return marca;
	}
	
	/**
	 * Establece la marca del coche
	 *
	 * @param marca la nueva marca del coche
	 */
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	/**
	 * Retorna el modelo del coche
	 *
	 * @return el modelo del coche
	 */
	public String getModelo () {
		return modelo;
	}
	
	/**
	 * Establece el modelo del coche
	 *
	 * @param modelo el nuevo modelo del coche
	 */
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Retorna el color del coche
	 *
	 * @return el color del coche
	 */
	public String getColor () {
		return color;
	}
	
	/**
	 * Establece el color del coche
	 *
	 * @param color el nuevo color del coche
	 */
	public void setColor (String color) {
		this.color = color;
	}
	
	/**
	 * Retorna la velocidad actual del coche
	 *
	 * @return la velocidad actual del coche
	 */
	public int getVelocidad () {
		return velocidad;
	}
	
	/**
	 * Establece la velocidad actual del coche
	 *
	 * @param velocidad la nueva velocidad actual del coche
	 */
	public void setVelocidad (int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Retorna el estado del motor (encendido o apagado)
	 *
	 * @return true si el motor está encendido, false si está apagado
	 */
	public boolean isMotorEncendido () {
		return motorEncendido;
	}
	
	/**
	 * Establece el estado del motor (encendido o apagado)
	 *
	 * @param motorEncendido el nuevo estado del motor
	 */
	public void setMotorEncendido (boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}
	
	/**
	 * Retorna la velocidad máxima del coche
	 *
	 * @return la velocidad máxima del coche
	 */
	public static int getVelocidadMaxima () {
		return VELOCIDAD_MAXIMA;
	}
	
	/**
	 * Enciende el motor del coche.
	 */
	public void arrancarMotor () {
		if (! this.motorEncendido) {
			this.motorEncendido = true;
			System.out.println ("El motor se ha encendido.");
		} else {
			System.out.println ("El motor ya está encendido.");
		}
	}
	
	/**
	 * Cambia la velocidad del coche.
	 *
	 * @param velocidad Nueva velocidad del coche en km/h.
	 */
	public void cambiarVelocidad (int velocidad) {
		this.velocidad = (velocidad >= 0 && velocidad <= VELOCIDAD_MAXIMA) ? velocidad : this.velocidad;
		System.out.println ("La velocidad se ha cambiado a " + this.velocidad + " km/h.");
	}
	
	/**
	 * Acelera el coche.
	 *
	 * @param incrementoVelocidad Incremento de velocidad en km/h.
	 */
	public void acelerar (int incrementoVelocidad) {
		if (motorEncendido) {
			velocidad = Math.min (velocidad + incrementoVelocidad, VELOCIDAD_MAXIMA);
			System.out.println ("La velocidad se ha incrementado a " + velocidad + " km/h.");
		} else {
			System.out.println ("No se puede acelerar. El motor está apagado.");
		}
	}
	
	/**
	 * Frena el coche.
	 *
	 * @param decrementoVelocidad Decremento de velocidad en km/h.
	 */
	public void frenar (int decrementoVelocidad) {
		int nuevaVelocidad = velocidad - decrementoVelocidad;
		if (nuevaVelocidad >= 0) {
			velocidad = nuevaVelocidad;
			System.out.println ("La velocidad se ha reducido a " + velocidad + " km/h.");
		} else {
			velocidad = 0;
			System.out.println ("El coche se ha detenido.");
		}
	}
	
	/**
	 * Apaga el motor del coche.
	 */
	public void pararMotor () {
		if (motorEncendido) {
			motorEncendido = false;
			velocidad = 0;
			System.out.println ("El motor se ha apagado.");
		} else {
			System.out.println ("El motor ya está apagado.");
		}
	}
}
