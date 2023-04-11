import javax.swing.JOptionPane;

/**
 * Esta clase representa una calculadora que permite realizar operaciones básicas con tres números
 * introducidos por el usuario.
 */
public class CAritmetica {

/**
 * Método principal que inicia la ejecución del programa.
 *
 * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
 */
public static void main ( String[] args ) {
 double num1 = 0, num2 = 0, num3 = 0;
 boolean correcto = false;

 // Pedir los tres números hasta que sean válidos
 while (!correcto) {
  try {
   num1 = Double.parseDouble( JOptionPane.showInputDialog( null,
	 "Introduce el primer número:",
	 "Pedir",
	 JOptionPane.QUESTION_MESSAGE ) );
   num2 = Double.parseDouble( JOptionPane.showInputDialog( null,
	 "Introduce el segundo número:",
	 "Pedir",
	 JOptionPane.QUESTION_MESSAGE ) );
   num3 = Double.parseDouble( JOptionPane.showInputDialog( null,
	 "Introduce el tercer número:",
	 "Pedir",
	 JOptionPane.QUESTION_MESSAGE ) );

   // Comprobar si el segundo y tercer número son diferentes de cero
   if (num2 == 0 || num3 == 0) {
	JOptionPane.showMessageDialog( null,
	  "No se puede dividir por cero. Inténtalo de nuevo.",
	  "Error",
	  JOptionPane.ERROR_MESSAGE );
   } else {
	correcto = true;
   }
  } catch (NumberFormatException e) {
   JOptionPane.showMessageDialog( null,
	 "Uno de los valores introducidos no es numérico. Inténtalo de nuevo.",
	 "Error",
	 JOptionPane.ERROR_MESSAGE );
  }
 }

 // Realizar operaciones básicas con los tres números
 double suma = num1 + num2 + num3;
 double resta = num1 - num2 - num3;
 double multiplicacion = num1 * num2 * num3;
 double division = num1 / num2 / num3;

 // Mostrar resultados
 JOptionPane.showMessageDialog( null,
   "Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion + "\nDivisión: " + division,
   "Resultado",
   JOptionPane.INFORMATION_MESSAGE );
}
}