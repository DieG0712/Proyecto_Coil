package hijo;

import padre.Alimentos;

public class Carne extends Alimentos{
	private String conservacion;

	public Carne(String nomProducto, double precio, int cantStok, String fechaVencimiento, double peso,
			String conservacion) {
		super(nomProducto, precio, cantStok, fechaVencimiento, peso);
		this.conservacion = conservacion;
	}

	public String getConservacion() {
		return conservacion;
	}

	public void setConservacion(String conservacion) {
		this.conservacion = conservacion;
	}
	public String registrar() {
		return "Alimento registrado: " + nomProducto;
	}
	public String mostrarInfo() {
		return "=== Información de la Refrigeradora ===\n" +
			       "Nombre: " + nomProducto + "\n" +
			       "Precio: S/ " + precio + "\n" +
			       "Stock disponible: " + cantStok + "\n" +
			       "Fecha Vencimiento: " + fechaVencimiento + "\n" +
			       "Peso: " + peso + "Kg\n" +
			       "Conservación: " + conservacion + "\n";
	}
	
}
