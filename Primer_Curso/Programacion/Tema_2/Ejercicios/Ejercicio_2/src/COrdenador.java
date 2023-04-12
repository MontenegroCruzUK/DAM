/**
 * Clase que representa a un ordenador con su marca, procesador, pantalla y estado de encendido.
 */
public class COrdenador {
	private String marca;           // Marca del ordenador.
	private String procesador;      // Tipo de procesador del ordenador.
	private String pantalla;        // Descripción de la pantalla del ordenador.
	private boolean ordenadorEncendido;   // Indica si el ordenador está encendido o apagado.
	private boolean presentacion;   // Indica si el ordenador está en modo presentación.
	
	/**
	 * Constructor sin argumentos. Inicializa los atributos a valores por defecto.
	 */
	
	public COrdenador () {
		// No hace nada, los atributos ya están inicializados a los valores por defecto.
	}
	
	/**
	 * Constructor que inicializa los atributos a los valores proporcionados.
	 *
	 * @param marca              la marca del ordenador.
	 * @param procesador         el tipo de procesador del ordenador.
	 * @param pantalla           la descripción de la pantalla del ordenador.
	 * @param ordenadorEncendido indica si el ordenador está encendido o apagado.
	 * @param presentacion       indica si el ordenador está en modo presentación.
	 */
	public COrdenador (String marca, String procesador, String pantalla, boolean ordenadorEncendido,
	                   boolean presentacion) {
		this.marca = marca;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.ordenadorEncendido = ordenadorEncendido;
		this.presentacion = presentacion;
	}
	
	/**
	 * Método getter para obtener la marca del ordenador.
	 *
	 * @return la marca del ordenador.
	 */
	public String getMarca () {
		return marca;
	}
	
	/**
	 * Método setter para establecer la marca del ordenador.
	 *
	 * @param marca la nueva marca del ordenador.
	 */
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	/**
	 * Método getter para obtener el tipo de procesador del ordenador.
	 *
	 * @return el tipo de procesador del ordenador.
	 */
	public String getProcesador () {
		return procesador;
	}
	
	/**
	 * Método setter para establecer el tipo de procesador del ordenador.
	 *
	 * @param procesador el nuevo tipo de procesador del ordenador.
	 */
	public void setProcesador (String procesador) {
		this.procesador = procesador;
	}
	
	/**
	 * Método getter para obtener la descripción de la pantalla del ordenador.
	 *
	 * @return la descripción de la pantalla del ordenador.
	 */
	public String getPantalla () {
		return pantalla;
	}
	
	/**
	 * Método setter para establecer la descripción de la pantalla del ordenador.
	 *
	 * @param pantalla la nueva descripción de la pantalla del ordenador.
	 */
	public void setPantalla (String pantalla) {
		this.pantalla = pantalla;
	}
	
	/**
	 * Método getter para obtener el estado de encendido del ordenador.
	 *
	 * @return true si el ordenador está encendido, false si está apagado.
	 */
	public boolean isOrdenadorEncendido () {
		return ordenadorEncendido;
	}
	
	public void setOrdenadorEncendido (boolean ordenadorEncendido) {
		this.ordenadorEncendido = ordenadorEncendido;
	}
	
	public boolean isPresentacion () {
		return presentacion;
	}
	
	public void setPresentacion (boolean presentacion) {
		this.presentacion = presentacion;
	}
	
	public void encenderOrdenador () {
		if (ordenadorEncendido) {
			System.out.println ("El ordenador ya está en marcha.");
		} else {
			ordenadorEncendido = true;
			System.out.println ("El ordenador se ha encendido.");
		}
	}
	
	/**
	 * Método para imprimir el estado actual del ordenador, incluyendo la marca, procesador y pantalla.
	 * También informa si el ordenador está encendido o apagado.
	 */
	public void estado () {
		System.out.println (
			"\nEstado del ordenador:" + "\nMarca: " + marca + "\nProcesador: " + procesador + "\nPantalla: " +
				pantalla + "\n");
		if (ordenadorEncendido) {
			System.out.println ("El ordenador está encendido.");
		} else {
			System.out.println ("El ordenador está apagado.");
		}
	}
}