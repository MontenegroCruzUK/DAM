/**
 * Clase que realiza operaciones aritméticas básicas (suma, resta, producto y cociente) con dos números enteros.
 */
public class CAritmetica {

/**
 * Método principal que ejecuta el programa.
 *
 * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
 */
public static void main(String[] args) {
 int numero_1 = 20;
 int numero_2 = 10;
 int resultado;

 // Suma
 resultado = numero_1 + numero_2;
 System.out.println(numero_1 + " + " + numero_2 + " = " + resultado);

 // Resta
 resultado = numero_1 - numero_2;
 System.out.println(numero_1 + " - " + numero_2 + " = " + resultado);

 // Producto
 resultado = numero_1 * numero_2;
 System.out.println(numero_1 + " * " + numero_2 + " = " + resultado);

 // Cociente
 resultado = numero_1 / numero_2;
 System.out.println(numero_1 + " / " + numero_2 + " = " + resultado);
}
}
