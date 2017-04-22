package controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JOptionPane;

import modelo.Ordinador;

public class Gestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeMap<String, Ordinador> modificar(TreeMap<String, Ordinador> data ){
		Scanner in=new Scanner(System.in);
	
		System.out.println("INTRODUCE THE MODEL TO MODIFY : ");
		String model = in.next();
		if (data.containsKey(model)){
			System.out.println("INTRODUCE THE NEW RAM VALUE : ");
			String ram = in.next();
			System.out.println("INTRODUCE THE NEW CPU MODEL : ");
			String cpu = in.next();
			System.out.println("INTRODUCE THE NEW STORAGE CAPACITY : ");
			String size = in.next();

			System.out.print("Save Changes? ( Y / N )");
			String input = in.next();	
			if (input == "Y"){	
				Ordinador o = new Ordinador(model, size, cpu, ram);
				data.put(model, o);		
			} else{
				System.out.println("CHANGES HAVE BEEN DISCARDED");
			}
		} else {
			System.out.println("THE MODEL DOES NOT EXISTS");
		}
		return data;
	}
}
