package modelo;

import java.io.Serializable;

public class Ordinador implements Serializable{
	
	private String model="";
	private String size="";
	private String cpu="";
	private String ram="";
	
	
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
	
	public String toString() {
		return "Ordenador [Modelo = " + model + ", Tamaño = " + size + ", Cpu = " + cpu + ", RAM = " + ram + "]";
	}
	
	public Ordinador(){};
	
	public Ordinador(String model, String size, String cpu, String ram) {
		super();
		this.model = model;
		this.size = size;
		this.cpu = cpu;
		this.ram = ram;
	}

	

}
