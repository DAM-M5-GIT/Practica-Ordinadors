package vista;

import java.util.Scanner;

import controlador.Gestor;

public class Main {
	
	Scanner menu = new Scanner(System.in);

	public static void main(String[] args) {

		Gestor gest = new Gestor();
		Main a = new Main();
		a.menuNumeric();
	}
	
	
	public  void menuNumeric(){

            int input = 0;
     

            while(input != 6)
            {
            System.out.print("Choose you option: \n 1 - A�adir. \n 2 - Buscar. "	+ 
            					"\n 3 - Volcar. \n 4 - Recuperar. \n 5 - Modificar. \n 6 - Salir.");
            input = menu.nextInt();
            
            
            switch (input) {
            case 1: System.out.println("a�adir"); //A�adir();
                break;

            case 2: System.out.println("buscar");//Buscar();
                break;

            case 3: System.out.println("volcar");//Volcar();
                break;

            case 4: System.out.println("recuperar");//Recuperar();
                break;
                
            case 5: System.out.println("modificar");//Modificar();
            	break;
            	
            case 6: System.exit(0);
            
            default: 
            	break;
            }
        }

		menuNumeric();
	}

}
