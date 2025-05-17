package hijo;

import padre.Alimentos;

public class Fruta extends Alimentos{
	private String conserva;
	public Fruta(String nomProducto, double precio, int cantStok, String fechaVencimiento, double peso,
			String conserva) {
		super(nomProducto, precio, cantStok, fechaVencimiento, peso);
		this.conserva = conserva;
	}
	public String getConserva() {
		return conserva;
	}
	public void setConserva(String conserva) {
		this.conserva = conserva;
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
			       "Conservación: " + conserva + "\n";
	}
	
}
