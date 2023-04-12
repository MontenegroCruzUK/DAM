/**
 * La clase CRacional representa un número racional y proporciona
 * métodos para asignar valores y visualizar el número en formato
 * "numerador / denominador".
 */
public class CRacional {
	private int numerador;
	private int denominador;
	
	/**
	 * El método "asignarDatos" se utiliza para asignar valores al
	 * numerador y denominador del número racional.
	 *
	 * @param numerador   el valor del numerador del número racional
	 * @param denominador el valor del denominador del número racional
	 */
	public void asignarDatos (int numerador, int denominador) {
		this.numerador = numerador;
		
		// Si el denominador es cero, se asigna un valor predeterminado de 1
		if (denominador == 0) {
			denominador = 1;
			this.denominador = denominador;
		}
		
		
	}
	
	/**
	 * El método "visualizarRacional" se utiliza para imprimir el número
	 * racional en la consola en el formato "numerador / denominador".
	 */
	public void visualizarRacional () {
		System.out.println ("Resultado -> "+this.numerador + " / " + this.denominador);
	}
	
	/**
	 * El método "main" se utiliza para crear una instancia de la clase CRacional,
	 * asignar valores al numerador y denominador utilizando el método "asignarDatos"
	 * y luego imprimir el número racional en la consola utilizando el método
	 * "visualizarRacional".
	 *
	 * @param args los argumentos de línea de comandos (no utilizados en este caso)
	 */
	public static void main (String[] args) {
		CRacional r1 = new CRacional ();
		r1.asignarDatos (2, 5);
		r1.visualizarRacional ();
	}
}
