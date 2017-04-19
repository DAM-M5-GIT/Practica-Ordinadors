package vista;

import java.util.Scanner;

import controlador.Gestor;

public class Main {
	
	

	public static void main(String[] args) {

            int input = 0;
     
            Scanner menu = new Scanner(System.in);
        	
        	Gestor gest = new Gestor();

            while(input != 6)
            {
            System.out.print("Elige una opción: \n 1 - Añadir. \n 2 - Buscar. "	+ 
            					"\n 3 - Volcar. \n 4 - Recuperar. \n 5 - Modificar. \n 6 - Salir.");
            input = menu.nextInt();
            
            
            switch (input) {
            case 1: System.out.println("Añadir"); //Añadir();
                break;

            case 2: System.out.println("Buscar");//Buscar();
                break;

            case 3: System.out.println("Volcar");//Volcar();
                break;

            case 4: System.out.println("Recuperar");//Recuperar();
                break;
                
            case 5: System.out.println("Modificar");//Modificar();
            	break;
            	
            case 6: System.exit(0);
            
            default: 
            	break;
            }
        }
	}
}

