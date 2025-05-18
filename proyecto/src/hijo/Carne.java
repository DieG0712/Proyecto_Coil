package hijo;

import padre.Alimentos;

public class Carne extends Alimentos{
	private String conservacion;
	private String nomCarne;
	public Carne(String nomProducto, double precio, int cantStok, String fechaVencimiento, double peso,
			String conservacion, String nomCarne) {
		super(nomProducto, precio, cantStok, fechaVencimiento, peso);
		this.conservacion = conservacion;
		this.nomCarne = nomCarne;
	}
	public String getConservacion() {
		return conservacion;
	}


	public void setConservacion(String conservacion) {
		this.conservacion = conservacion;
	}


	public String getNomCarne() {
		return nomCarne;
	}


	public void setNomCarne(String nomCarne) {
		this.nomCarne = nomCarne;
	}


	public String registrar() {
		return "Alimento registrado: " + nomProducto;
	}
	public String mostrarInfo() {
		return "=== Información de la Refrigeradora ===\n" +
			       "Nombre del Carne: " + nomCarne + "\n" +
			       "Precio: S/ " + precio + "\n" +
			       "Stock disponible: " + cantStok + "\n" +
			       "Fecha Vencimiento: " + fechaVencimiento + "\n" +
			       "Peso: " + peso + "Kg\n" +
			       "Conservación: " + conservacion + "\n";
	}
}
