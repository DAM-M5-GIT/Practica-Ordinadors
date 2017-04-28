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

	public TreeMap<String, Ordinador> restoreData(TreeMap<String, Ordinador> tree)
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
		return tree;
	}
}
