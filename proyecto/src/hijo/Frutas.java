package hijo;

import padre.Alimentos;

public class Frutas extends Alimentos{
	private String conserva;
	private String nomFruta;
	
	public Frutas(String nomProducto, double precio, int cantStok, String fechaVencimiento, double peso,
			String conserva, String nomFruta) {
		super(nomProducto, precio, cantStok, fechaVencimiento, peso);
		this.conserva = conserva;
		this.nomFruta = nomFruta;
	}
	
	public String getConserva() {
		return conserva;
	}

	public void setConserva(String conserva) {
		this.conserva = conserva;
	}

	public String getNomFruta() {
		return nomFruta;
	}

	public void setNomFruta(String nomFruta) {
		this.nomFruta = nomFruta;
	}

	public String registrar() {
		return "Alimento registrado: " + nomProducto;
	}
	public String mostrarInfo() {
		return "=== Información de la Refrigeradora ===\n" +
			       "Nombre de la Fruta: " + nomFruta + "\n" +
			       "Precio: S/ " + precio + "\n" +
			       "Stock disponible: " + cantStok + "\n" +
			       "Fecha Vencimiento: " + fechaVencimiento + "\n" +
			       "Peso: " + peso + "Kg\n" +
			       "Conservación: " + conserva + "\n";
	}
}
