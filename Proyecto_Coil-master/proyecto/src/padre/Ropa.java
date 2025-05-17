package padre;

import abuelo.Producto;

public abstract class Ropa extends Producto{
	protected int talla;
	protected String color,marca;
	public Ropa(String nomProducto, double precio, int cantStok, int talla, String color, String marca) {
		super(nomProducto, precio, cantStok);
		this.talla = talla;
		this.color = color;
		this.marca = marca;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
