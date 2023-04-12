/**
 * Esta clase es la clase principal del programa, que se utiliza para crear un objeto de la clase COrdenador y ejecutar métodos en él.
 */
public class CMiOrdenador {
	public static void main (String[] args) {
		//Se crea un objeto de la clase COrdenador.
		COrdenador miOrdenador = new COrdenador ();
		//Se establece la marca, procesador y pantalla del ordenador mediante el uso de los setters.
		miOrdenador.setMarca ("AST");
		miOrdenador.setProcesador ("Intel Pentium");
		miOrdenador.setPantalla ("TFT");
		//Se enciende el ordenador mediante el uso del método "encenderOrdenador".
		miOrdenador.encenderOrdenador ();
		//Se imprime el estado actual del ordenador mediante el uso del método "estado".
		miOrdenador.estado ();
		miOrdenador.apagarOrdenador ();
	}
}
