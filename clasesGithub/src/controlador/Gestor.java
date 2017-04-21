package controlador;

import java.util.Scanner;
import java.util.TreeMap;

import modelo.Ordinador;

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
			System.out.println("Tama�o: \n");
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
	
	public void Buscar(TreeMap<String, Ordinador> ordenadores){
		System.out.println("Buscar por nombre de modelo: ");
		String model = scanner.next();

		if(ordenadores.containsKey(model)){
			ordenadores.get(model).toString();
		}else{
		System.out.println("No existe este modelo");
		}

	}


}
