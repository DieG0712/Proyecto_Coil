package abuelo;

public abstract class Producto {
	protected String nomProducto;
	protected double precio;
	protected int cantStok;
	public Producto(String nomProducto, double precio, int cantStok) {
		this.nomProducto = nomProducto;
		this.precio = precio;
		this.cantStok = cantStok;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantStok() {
		return cantStok;
	}
	public void setCantStok(int cantStok) {
		this.cantStok = cantStok;
	}
	public abstract String Comprar();
	public abstract String Devolver();
	public abstract boolean Devolucion();
	
}

