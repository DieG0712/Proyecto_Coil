package padre;

import abuelo.Producto;

public abstract class Alimentos extends Producto{
	protected String fechaVencimiento;
	protected double peso;
	public Alimentos(String nomProducto, double precio, int cantStok, String fechaVencimiento, double peso) {
		super(nomProducto, precio, cantStok);
		this.fechaVencimiento = fechaVencimiento;
		this.peso = peso;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
