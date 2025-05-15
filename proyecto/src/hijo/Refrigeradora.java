package hijo;

import padre.Electrodomesticos;

public class Refrigeradora extends Electrodomesticos {
	
	public Refrigeradora(String nomProducto, double precio, int cantStok, String marca,
			String modelo, int garantia) {
		super(nomProducto, precio, cantStok, marca, modelo, garantia);
	}

	public String Comprar() {
		return "Compra realizada con éxito.\n" +
				"Producto: " + nomProducto + " (" + marca + " - " + modelo + ")\n" +
				"Precio: S/ " + precio + "\n" +
				"Stock restante: " + cantStok;
	}
	public String Devolver() {
		
		return null;
	}
	
	public boolean Devolucion() {
		return false;
	}
	
}
