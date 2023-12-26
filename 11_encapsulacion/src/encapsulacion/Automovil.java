package encapsulacion;

public class Automovil {

	//Atributos
	
	int precio;
	String marca;
	
	//Constructor
	public Automovil() {
		System.out.println("Se ha creado un objeto automovil");
	}
	//metodos getter 
	public int getPrecio() {
		return this.precio;
		
	}
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}
	
	
	//metodos setter
	
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	
	public void setMarca(String m) {
	this.marca =m;	
	}
	
	
}
