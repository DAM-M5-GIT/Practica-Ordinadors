package vista;

import controlador.Gestor;
import modelo.Ordinador;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	// MEN� PRINCIPAL
	public static void main(String[] args) {

            int input = 0; // VARIABLE DE USO PARA SELECCI�N DE OPCIONES
     
            //DECLARACi�N DE SCANNER PARA LECTURA DE OPCIONES TECLEADAS
            Scanner menu = new Scanner(System.in);
        	
            //DECLARACI�N DEL GESTOR PARA EL USO DE M�TODOS DEL MISMO
        	Gestor gest = new Gestor();
        	
        	//DECLARACI�N DEL TREEMAP
        	TreeMap<String, Ordinador> tm = new TreeMap<String, Ordinador>();

            while(input != 6)
            {
            	//MUESTRA DE OPCIONES DEL MEN�
            System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. \n 3 - List. "	+
            					"\n 4 - Save . \n 5 - Open file. \n 6 - Modify. \n 7 - Exit.");
            input = menu.nextInt();
            
            //USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES SELLECIONADAS
            switch (input) {
            case 1: System.out.println("Add"); //A�adir();
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
                break;
                
            case 6: System.out.println("Modify");//Modificar();
            	break;
            	
            case 7: System.exit(0);
            
            default: 
            	break;
            }
        }
	}
}

