package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		
	}
	
	public Anfibio(){
		this("", 0, "", "", "", false);
			
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
	}
	
	public ArrayList<Anfibio> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Anfibio> listado){
		Anfibio.listado = listado;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

}
