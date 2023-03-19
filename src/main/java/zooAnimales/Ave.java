package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas){
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		
	}
	
	public Ave(){
		this("", 0, "", "", null, "");
			
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
		new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero, Zona zona) {
		new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		aguilas++;
	}
	
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Ave> listado){
		Ave.listado = listado;
	}
	
	public String getPelaje() {
		return colorPlumas;
	}
	
	public void setPelaje(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
}
