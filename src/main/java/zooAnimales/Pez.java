package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		
	}
	
	public Pez(){
		this("", 0, "", "", "", 0);
			
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
	}
	
	public static void crearBacalao(String nombre, int edad, String genero) {
		new Pez(nombre, edad, "oceano", genero, "gris", 6);
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
