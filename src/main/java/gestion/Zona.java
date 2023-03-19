package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales){
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona(){
		this("", null, null);
		
	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoologico() {
		return zoo;
	}
	
	public void setZoologico(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public void setAnimales (ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
}
