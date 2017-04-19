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
            System.out.print("Choose your option: \n 1 - Add. \n 2 - Search. "	+ 
            					"\n 3 - Turn Over . \n 4 - Recovery. \n 5 - Modify. \n 6 - Exit.");
            input = menu.nextInt();
            
            
            switch (input) {
            case 1: System.out.println("Add"); //Añadir();
                break;

            case 2: System.out.println("Search");//Buscar();
                break;

            case 3: System.out.println("Turn Over");//Volcar();
                break;

            case 4: System.out.println("Recovery");//Recuperar();
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

