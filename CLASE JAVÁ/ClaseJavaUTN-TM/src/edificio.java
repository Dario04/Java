
public class edificio {

	int altura;
	int ancho;
	String material;
	int cantVentanas;

	public edificio(int altura, int ancho, String material, int cantVentanas) {
		super();
		this.altura = altura;
		this.ancho = ancho;
		this.material = material;
		this.cantVentanas = cantVentanas;
	}

	@Override
	public String toString() {
		return "edificio [altura=" + altura + ", ancho=" + ancho + ", material=" + material + ", cantVentanas="
				+ cantVentanas + "]";
	}

	public int precio() {
		int total = 0;

		if (material.equalsIgnoreCase("marmol")) {
			total = (1500 * ancho * altura) + (cantVentanas * 200);
		} else if(material.equalsIgnoreCase("piedra")){
			total = (1000 * ancho * altura) + (cantVentanas * 200);
		}else if(material.equalsIgnoreCase("madera")) {
			total = (500 * ancho * altura) + (cantVentanas * 200);
		}

		return total;
	}

}// aca cierro la clase edificio
