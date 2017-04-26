/*MANUAL DE ESTILOS:
 * EL IDIOMA A LA VISTA DEL PROGRAMA SERÁ EN INGLÉS.
 * LOS COMENTARIOS SE HARÁN EN ESPAÑOL Y CON MAYÚSCULAS PARA SU MEJOR VISTA Y COMPRENSIÓN.
 * AL PRINCIPIO DE CADA FUNCIÓN ASIGNADA, DEBERÁ INDICARSE QUE EQUIPO LA HA LLEVADO A CABO.
 * EL USO DE NOMBRES DE VARIABLES ES LIBRE PARA CADA EQUIPO DE TRABAJO.
 * EL CÓDIGO HA DE ESTAR BIEN INDENTADO Y FORMATEADO. (CONTROLANDO ESPACIOS E INTROS PARA QUE SE VEA CÓDIGO LIMPIO)
 * RECOMENDACIÓN DE USO DE "CTRL + MAYUS + F" PARA ELLO. (INDENTADO CON ESTARDARES DE JAVA).
*/

package vista;

import controlador.Gestor;
import modelo.Ordinador;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	// MENÚ PRINCIPAL
	public static void main(String[] args) {


		int input = 0; // VARIABLE DE USO PARA SELECCIÓN DE OPCIONES

		// DECLARACÍÓN DE SCANNER PARA LECTURA DE OPCIONES TECLEADAS
		Scanner menu = new Scanner(System.in);

		// DECLARACIÓN DEL GESTOR PARA EL USO DE MÉTODOS DEL MISMO
		Gestor gest = new Gestor();

		// DECLARACIÓN DEL TREEMAP
		TreeMap<String, Ordinador> tm = new TreeMap<String, Ordinador>();

		while (input != 7) {
			// MUESTRA DE OPCIONES DEL MENÚ
			System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. \n 3 - List. "
					+ "\n 4 - Save . \n 5 - Open file. \n 6 - Modify. \n 7 - Exit.");
			try {
				input = menu.nextInt();

				// USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES
				// SELECIONADAS
				switch (input) {
				case 1:
					System.out.println("Add"); // AÑADIR
					break;

				case 2:
					System.out.println("Search"); // BUSCAR
					break;

				case 3:
					System.out.println("List"); // LISTAR
					break;

				case 4:
					System.out.println("Save"); // GUARDAR
					break;
				case 5:
					System.out.println("OpenFile"); // RECUPERAR
					tm.clear();
					gest.restoreData(tm);
					break;

				case 6:
					System.out.println("Modify"); // MODIFICAR
					break;

				case 7:
					System.exit(0);

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Introduce a new model");
				main(null);
			}
		}
	}
}
