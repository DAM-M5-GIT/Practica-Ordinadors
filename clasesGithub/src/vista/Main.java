package vista;

import java.util.Scanner;
import java.util.TreeMap;

import controlador.Gestor;
import modelo.Ordinador;

public class Main {
	private static TreeMap<String, Ordinador> storage = new TreeMap<String, Ordinador>();
	public static void main(String[] args) {

            int input = 0;
     
            Scanner menu = new Scanner(System.in);

            while(input != 6)
            {
            System.out.print("Choose your option: \n 1 - Añadir. \n 2 - Buscar. "	+ 
            					"\n 3 - Volcar. \n 4 - Recuperar. \n 5 - Modificar. \n 6 - Salir.");
            input = menu.nextInt();
            
            
            switch (input) {
            case 1: System.out.println("añadir"); //Añadir();
                break;

            case 2: System.out.println("buscar");//Buscar();
                break;

            case 3: System.out.println("volcar");//Volcar();
                break;

            case 4: System.out.println("recuperar");//Recuperar();
                break;
                
            case 5: 
            	//tm = gest.modificar(storage);
            	break;            	
            case 6: System.exit(0);
            
            default: 
            	break;
            }
        }
	}
}

