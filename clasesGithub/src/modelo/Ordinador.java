package modelo;

import java.io.Serializable;

public class Ordinador implements Serializable {

	// DECLARACIÓN DE ATRIBUTOS DE LA CLASE ORDENADOR
	private String model = "";
	private String size = "";
	private String cpu = "";
	private String ram = "";

	// SETTERS , GETTERS y CONSTRUCTORES
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	// TO STRING PARA MOSTRAR FRASES POR PANTALLA
	public String toString() {
		return "Computer [Model = " + model + ", Size = " + size + ", Cpu = " + cpu + ", RAM = " + ram + "]";
	}

	// CONSTRUCTOR VACÍO
	public Ordinador() {
	};

	// CONSTRUCTOR CON PARÁMETROS
	public Ordinador(String model, String size, String cpu, String ram) {
		super();
		this.model = model;
		this.size = size;
		this.cpu = cpu;
		this.ram = ram;
	}
}
