package hijo;

import padre.Ropa;

public class Pantalon extends Ropa{
	private String modelo;

	public Pantalon(String nomProducto, double precio, int cantStok, int talla, String color, String marca,
			String modelo) {
		super(nomProducto, precio, cantStok, talla, color, marca);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//metodos abstractos
	public String registrar() {
	     return "Polo registrado: " + nomProducto;
	}

	   
	public String mostrarInfo() {
	     return "Nombre: " + nomProducto + "\n"+" Precio: S/" + precio +"\n"+ " Stock: " + cantStok +
	    		 "\n"+ " Talla: " + talla + "\n"+ " Color: " + color + "\n"+ " Marca: " + marca +
	             "\n"+ " TMODELO: " + modelo;
	}
}
