package padre;

import abuelo.Producto;

public abstract class Electrodomesticos extends Producto {
	protected String marca;
	protected String modelo;
	protected int garantia;
	public Electrodomesticos(String nomProducto, double precio, int cantStok, String marca,
			String modelo, int garantia) {
		super(nomProducto, precio, cantStok);
		this.marca = marca;
		this.modelo = modelo;
		this.garantia = garantia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
}
