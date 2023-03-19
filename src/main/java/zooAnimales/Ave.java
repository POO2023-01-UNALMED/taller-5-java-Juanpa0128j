package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	
	public Ave(){
		this("", 0, "", "", "");
			
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static void crearHalcon(String nombre, int edad, String genero) {
		new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
	}
	
	public static void crearAguila(String nombre, int edad, String genero) {
		new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
	}
	
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Ave> listado){
		Ave.listado = listado;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
