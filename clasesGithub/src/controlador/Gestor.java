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
	
	//FUNCION BUSCAR POR MODELO
	public void Buscar(TreeMap<String, Ordinador> ordenadores){
		System.out.println("Search model by name: ");
		String model = scanner.next();
		//MOSTRAR DETALLES DEL PC SI EXISTE EL MODELO
		if(ordenadores.containsKey(model)){
			ordenadores.get(model).toString();
		}else{
			//SI EL MODELO NO EXISTE
			System.out.println("This model does not exist.");
		}

	}


}
