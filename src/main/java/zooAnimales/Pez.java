package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		
	}
	
	public Pez(){
		this("", 0, "", "", null, "", 0);
			
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon(String nombre, int edad, String genero, Zona zona) {
		new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
		salmones++;
	}
	
	public void crearBacalao(String nombre, int edad, String genero, Zona zona) {
		new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
		bacalaos++;
	}
	
	public ArrayList<Pez> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Pez> listado){
		Pez.listado = listado;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}
