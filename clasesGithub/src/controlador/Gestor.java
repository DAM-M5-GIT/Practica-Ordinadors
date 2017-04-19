package controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Gestor {
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int add(){
		String model = null;
		Integer size = null;
		String cpu = null;
		Integer ram = null;
		try{
			System.out.println("Model: \n");
			model = scanner.next();
			System.out.println("Tamaño: \n");
			size = scanner.nextInt();
			System.out.println("Processador: \n");
			cpu = scanner.next();
			System.out.println("Ram: \n");
			ram = scanner.nextInt(); 
		}catch(Exception e){
			System.out.println(e);
			return 1;
		}
		
		
		return 0;
	}
	
	public void guardar(TreeMap tree){
	//El usuario deberá introducir el nombre del fichero en el que guardaremos, y guardaremos el TreeMap directamente	
		System.out.println("Please, enter the name of the file to save the TreeMap: \n");
		String fitxer = scanner.next();
		
		try{
	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
	}
	}
}
