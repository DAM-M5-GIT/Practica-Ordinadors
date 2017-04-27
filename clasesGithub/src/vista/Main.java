/*MANUAL DE ESTILOS:
 * EL IDIOMA A LA VISTA DEL PROGRAMA SER� EN INGL�S.
 * LOS COMENTARIOS SE HAR�N EN ESPA�OL Y CON MAY�SCULAS PARA SU MEJOR VISTA Y COMPRENSI�N.
 * AL PRINCIPIO DE CADA FUNCI�N ASIGNADA, DEBER� INDICARSE QUE EQUIPO LA HA LLEVADO A CABO.
 * EL USO DE NOMBRES DE VARIABLES ES LIBRE PARA CADA EQUIPO DE TRABAJO.
 * EL C�DIGO HA DE ESTAR BIEN INDENTADO Y FORMATEADO. (CONTROLANDO ESPACIOS E INTROS PARA QUE SE VEA C�DIGO LIMPIO)
 * RECOMENDACI�N DE USO DE "CTRL + MAYUS + F" PARA ELLO. (INDENTADO CON ESTARDARES DE JAVA).
*/

package vista;
import controlador.Gestor;
import modelo.Ordinador;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	// MEN� PRINCIPAL
	public static void main(String[] args) {


		int input = 0; // VARIABLE DE USO PARA SELECCI�N DE OPCIONES

		// DECLARAC��N DE SCANNER PARA LECTURA DE OPCIONES TECLEADAS
		Scanner menu = new Scanner(System.in);

		// DECLARACI�N DEL GESTOR PARA EL USO DE M�TODOS DEL MISMO
		Gestor gest = new Gestor();

		// DECLARACI�N DEL TREEMAP
		TreeMap<String, Ordinador> tm = new TreeMap<String, Ordinador>();

		while (input != 7) {
			// MUESTRA DE OPCIONES DEL MEN�
			System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. \n 3 - List. "
					+ "\n 4 - Save . \n 5 - Open file. \n 6 - Modify. \n 7 - Exit.");
			try {
				input = menu.nextInt();

				// USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES
				// SELECIONADAS
				switch (input) {
				case 1:
					System.out.println("Add"); // A�ADIR
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
					tm=gest.modificar(tm);
					break;

				case 7:
					System.exit(0);

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("No letters allowd");
				main(null);
			}
		}
	}
}
