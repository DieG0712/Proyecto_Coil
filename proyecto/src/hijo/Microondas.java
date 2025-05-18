package hijo;

import padre.Electrodomesticos;

public class Microondas extends Electrodomesticos{
	
	public Microondas(String nomProducto, double precio, int cantStok, String marca,
			String modelo, int garantia) {
		super(nomProducto, precio, cantStok, marca, modelo, garantia);
	}

	public String registrar() {
		return "Producto registrado: " + nomProducto ;
	}
	public String mostrarInfo() {
		return "=== Información de la Refrigeradora ===\n" +
			       "Nombre: " + nomProducto + "\n" +
			       "Precio: S/ " + precio + "\n" +
			       "Stock disponible: " + cantStok + "\n" +
			       "Marca: " + marca + "\n" +
			       "Modelo: " + modelo + "\n" +
			       "Garantía: " + garantia + " meses\n";
	}	
}
