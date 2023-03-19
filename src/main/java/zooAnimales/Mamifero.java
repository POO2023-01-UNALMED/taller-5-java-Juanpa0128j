package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {

	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas){
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		
	}
	
	public Mamifero(){
		this("", 0, "", "", null, false, 0);
			
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
		new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
		caballos++;
	}
	
	public void crearLeon(String nombre, int edad, String genero, Zona zona) {
		new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		leones++;
	}
	
	public ArrayList<Mamifero> getListado(){
		return listado;
	}
	
	public void setListado(ArrayList<Mamifero> listado){
		Mamifero.listado = listado;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
