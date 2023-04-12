public class Main {
	/**
	 * Este es el método principal de la aplicación que crea un nuevo objeto de la clase CCoche
	 * <p>
	 * con la marca Toyota, modelo Corolla y color blanco, y luego realiza varias operaciones
	 * <p>
	 * con el coche, como encender el motor, cambiar la velocidad, acelerar, frenar y apagar el motor.
	 *
	 * @param args Argumentos de la línea de comandos. No se utilizan en esta aplicación.
	 */
	public static void main (String[] args) {
		
		// Crear un objeto CCoche con marca Toyota, modelo Corolla y color blanco
		CCoche coche = new CCoche ("Toyota", "Corolla", "Blanco");
		
		// Imprimir la marca, modelo y color del coche
		System.out.println ("Marca: " + coche.getMarca ());
		System.out.println ("Modelo: " + coche.getModelo ());
		System.out.println ("Color: " + coche.getColor ());
		
		// Encender el motor del coche
		coche.setMotorEncendido (true);
		if (! coche.isMotorEncendido ()) {
			System.out.println ("No se puede acelerar. El motor está apagado.");
			coche.arrancarMotor ();
		}
		
		// Cambiar la velocidad del coche a 10 km/h
		coche.cambiarVelocidad (10);
		
		// Acelerar el coche a 40 km/h
		coche.acelerar (40);
		
		// Frenar el coche a 5 km/h
		coche.frenar (5);
		
		// Apagar el motor del coche
		coche.pararMotor ();
	}
}