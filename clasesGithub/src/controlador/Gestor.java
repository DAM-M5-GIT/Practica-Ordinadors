package controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Gestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void modificar(){
		Scanner in=new Scanner(System.in);
		Map<String, List <Bus>> karte = new TreeMap<String, List <Bus>>();
		
		System.out.print("Save Changes? ( Y / N )");
		String input = in.next();
		
		if (input == "Y"){
			try{
			     ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ordinadors.txt"));
			     out.writeObject(karte);
			     out.close();
			}
			catch(Exception e)
			{
			   System.out.println("Error."+e); 
			}
						
		}				
		
		else if(input == "N") { modificar();}	
		
	}
}
