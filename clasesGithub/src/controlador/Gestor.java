package controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JOptionPane;

import modelo.Ordinador;

public class Gestor {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	// FUNCI�N DAMO
	public int add(TreeMap<String, Ordinador> data) {

		String model = null;
		String size = null;
		String cpu = null;
		String ram = null;

		try {
			System.out.println("Model: \n");
			model = scanner.next();
			System.out.println("Size: \n");
			size = scanner.next();
			System.out.println("CPU: \n");
			System.out.println("Tama�o: \n");
			size = scanner.next();
			System.out.println("Processador: \n");
			cpu = scanner.next();
			System.out.println("Ram: \n");
			ram = scanner.next();
			Ordinador o = new Ordinador(model, size, cpu, ram);
			data.put(model, o);

		} catch (Exception e) {
			System.out.println(e);
			return 1;
		}
		return 0;
	}

	// FUNCI�N EDRA
	public void list(TreeMap<String, Ordinador> tree) {

		try {
			if (tree.isEmpty()) {
				System.out.println("The table is empty.");
			} else {
				Set<String> keys = tree.keySet();
				String message = "";
				for (String key : keys) {
					message = message + " | MODEL: " + tree.get(key).getModel() + " | SIZE: " + tree.get(key).getSize()
							+ " | RAM: " + tree.get(key).getRam() + "  | CPU: " + tree.get(key).getCpu() + "\n";
				}
				System.out.println(message);
			}
		} catch (Exception e) {
			System.err.println("Error" + e);
		}
	}

	// FUNCI�N JODA
	public void guardar(TreeMap<String, Ordinador> tree) {

		// EL USUARIO DEBER� INTRODUCIR EL NOMBRE DEL FICHERO EN EL QUE SE VA A GUARDAR.
		// SE GUARDAR� EL TREEMAP DIRECTAMENTE
		System.out.println("Please, enter the name of the file to save the TreeMap: \n");
		String fitxer = scanner.next();

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fitxer));
			out.writeObject(tree);
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// FUNCI�N UTCA --> DESTINADA A LA MODIFICACI�N DE UN ORDENADOR
	public TreeMap<String, Ordinador> modificar(TreeMap<String, Ordinador> data) {
		Scanner in = new Scanner(System.in);

		System.out.println("INTRODUCE THE MODEL TO MODIFY : ");
		String model = in.next();
		if (data.containsKey(model)) {
			System.out.println("INTRODUCE THE NEW RAM VALUE : ");
			String ram = in.next();
			System.out.println("INTRODUCE THE NEW CPU MODEL : ");
			String cpu = in.next();
			System.out.println("INTRODUCE THE NEW STORAGE CAPACITY : ");
			String size = in.next();

			System.out.print("Save Changes? ( Y / N )");
			String input = in.next();
			if (input == "Y") {
				Ordinador o = new Ordinador(model, size, cpu, ram);
				data.put(model, o);
			} else {
				System.out.println("CHANGES HAVE BEEN DISCARDED");
			}
		}else {
			System.out.println("THE MODEL DOES NOT EXIST");
		}
		return data;
	}
	

	public void restoreData(TreeMap<String, Ordinador> tree)
	{
		System.out.println("Enter the file's name which data shall be restored: \n");
		String file = scanner.next();
		File fileToRead = new File(file);
		if(fileToRead.exists())
		{
			try
			{
				ObjectInputStream inputData = new ObjectInputStream(new FileInputStream(file));
				tree = (TreeMap<String, Ordinador>) inputData.readObject();
				inputData.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Can't find file, check file name and try it again");
		}
	}
	
	//FUNCION DAMO - FUNCI�N PARA BUSCAR MODELO DEL PC
	public void search(TreeMap<String, Ordinador> ordenadores){

		String message ="";
		System.out.println("Search model by name: ");
		String model = scanner.next();
		//SI ENCRUENTRA EL MODELO, MOSTRAMOS LOS DETALLES DEL PC SI EXISTE
		if(ordenadores.containsKey(model)){
		message = message + " Model = " + ordenadores.get(model).getModel()+ 
		", Size = " + ordenadores.get(model).getSize()+
		", Ram = " + ordenadores.get(model).getRam() +
		"i Cpu = " + ordenadores.get(model).getCpu();
		System.out.println("Computer: [ "+message+" ]");
		}else{
		//SI EL MODELO NO EXISTE
		System.out.println("This model does not exist.");	
			}
		}
}
