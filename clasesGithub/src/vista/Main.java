package vista;

import java.util.Scanner;
import java.util.TreeMap;

import controlador.Gestor;
import modelo.Ordinador;

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
            System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. "	+ 
            					"\n 3 - Save . \n 4 - Open file. \n 5 - Modify. \n 6 - Exit.");
            input = menu.nextInt();
            
            //USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES SELLECIONADAS
            switch (input) {
            case 1: System.out.println("Add"); //A�adir();
                break;

            case 2: System.out.println("Search");//Buscar();
                break;

            case 3: System.out.println("Save");//Volcar();
                break;

            case 4: System.out.println("OpenFile");//Recuperar();
                break;
                
            case 5: System.out.println("Modify");//Modificar();
            	break;
            	
            case 6: System.exit(0);
            
            default: 
            	break;
            }
        }
	}
}

