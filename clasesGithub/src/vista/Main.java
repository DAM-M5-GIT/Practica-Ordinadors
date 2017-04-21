package vista;

import java.util.Scanner;
import java.util.TreeMap;

import controlador.Gestor;
import modelo.Ordinador;

public class Main {
	
	// MENÚ PRINCIPAL
	public static void main(String[] args) {

            int input = 0; // VARIABLE DE USO PARA SELECCIÓN DE OPCIONES
     
            //DECLARACiÓN DE SCANNER PARA LECTURA DE OPCIONES TECLEADAS
            Scanner menu = new Scanner(System.in);
        	
            //DECLARACIÓN DEL GESTOR PARA EL USO DE MÉTODOS DEL MISMO
        	Gestor gest = new Gestor();
        	
        	//DECLARACIÓN DEL TREEMAP
        	TreeMap<String, Ordinador> tm = new TreeMap<String, Ordinador>();

            while(input != 6)
            {
            	//MUESTRA DE OPCIONES DEL MENÚ
            System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. "	+ 
            					"\n 3 - Save . \n 4 - Open file. \n 5 - Modify. \n 6 - Exit.");
            input = menu.nextInt();
            
            //USO DE SWICH PARA EL DIRECCIONAMIENTO DE LAS OPCIONES SELLECIONADAS
            switch (input) {
            case 1: System.out.println("Add"); //Añadir();
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

