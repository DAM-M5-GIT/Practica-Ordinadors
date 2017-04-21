package controlador;

import java.util.Scanner;

public class Gestor {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int add() {
        String model = null;
        Integer size = null;
        String cpu = null;
        Integer ram = null;
        try {
            System.out.println("Model: \n");
            model = scanner.next();
            System.out.println("Tama�o: \n");
            size = scanner.nextInt();
            System.out.println("Processador: \n");
            cpu = scanner.next();
            System.out.println("Ram: \n");
            ram = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
        return 0;
    }

//    Function Edra
    public void list(TreeMap taula) {
        try {
            if (taula.isEmpty()) {
                System.out.println("The table is empty.");
            } else {
                Set<String> keys = taula.keySet();
                String message = "";
                for (String key : keys) {
                    message = message + " | MODELO: " + taula.get(key).getModelo() + " | RAM: " + taula.get(key).getRam()
                            + " | DISCO DURO: " + taula.get(key).getDiscoduro() + "  | PROCESADOR: "
                            + taula.get(key).getProcesador() + "\n";
                }
                System.out.println(message);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

    }
}
