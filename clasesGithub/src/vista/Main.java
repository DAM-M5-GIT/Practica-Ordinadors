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
            					"\n 3 - Save . \n 4 - Open file. \n 5 - Modify. \n 6 - Exit.");
            input = menu.nextInt();
            
            
            switch (input) {
            case 1: System.out.println("Add"); //A�adir();
                break;

            case 2: System.out.println("Search");//Buscar();
            	//gest.Buscar(tm);
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

