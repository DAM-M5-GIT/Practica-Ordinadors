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

<<<<<<< HEAD
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
					gest.add(tm);
					break;

				case 2:
					System.out.println("Search"); // BUSCAR
					break;

				case 3:
					System.out.println("List"); // LISTAR
					break;

				case 4:
					System.out.println("Save"); // GUARDAR
					gest.guardar(tm);
					break;
				case 5:
					System.out.println("OpenFile"); // RECUPERAR
					break;

				case 6:
					System.out.println("Modify"); // MODIFICAR
					tm = gest.modificar(tm);
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
=======
            int input = 0; // VARIABLE DE USO PARA SELECCIï¿½N DE OPCIONES
     
            //DECLARACiï¿½N DE SCANNER PARA LECTURA DE OPCIONES TECLEADAS
            Scanner menu = new Scanner(System.in);
        	
            //DECLARACIï¿½N DEL GESTOR PARA EL USO DE Mï¿½TODOS DEL MISMO
        	Gestor gest = new Gestor();
        	
        	//DECLARACIï¿½N DEL TREEMAP
        	TreeMap<String, Ordinador> tm = new TreeMap<String, Ordinador>();

            while(input != 6)
            {
            	//MUESTRA DE OPCIONES DEL MENï¿½
            System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. \n 3 - List. "	+
            					"\n 4 - Save . \n 5 - Open file. \n 6 - Modify. \n 7 - Exit.");
            input = menu.nextInt();
            
            //USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES SELLECIONADAS
            switch (input) {
            case 1: System.out.println("Add"); //Aï¿½adir();
                break;

            case 2: System.out.println("Search");//Buscar();
                break;

            case 3: System.out.println("List");//Llistar();
                    gest.list(tm);
                break;

            case 4: System.out.println("Save");//Guardar();
            		gest.guardar(tm);
                break;
            case 5: System.out.println("OpenFile");//Recuperar();
		            tm.clear();
		            gest.restoreData(tm);
                break;
                
            case 6: System.out.println("Modify");//Modificar();
            	gest.modificar(tm);
            	break;
            	
            case 7: System.exit(0);
            
            default: 
            	break;
            }
        }
>>>>>>> ba4cf300d6b447582c307b223ee487adbef9429d
	}
}
