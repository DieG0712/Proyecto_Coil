package hijo;

import padre.Ropa;

public class Camisa extends Ropa{
	private String modelo;

	//constructor
	public Camisa(String nomProducto, double precio, int cantStok, int talla, String color, String marca,
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
	

    public String registrar() {
        return "Polo registrado: " + nomProducto;
    }

   
    public String mostrarInfo() {
        return "Nombre: " + nomProducto + "\n"+" Precio: S/" + precio +"\n"+ " Stock: " + cantStok +
        		"\n"+ " Talla: " + talla + "\n"+ " Color: " + color + "\n"+ " Marca: " + marca +
                "\n"+ " TMODELO: " + modelo;
    }

}
