
public class COCHE {
	String Color;
	int precio;
	int ruedas;
	Motor Motor0;
	public COCHE(String color, int precio, int ruedas, Motor motor0) {
		super();
		this.Color = color;
		this.precio = precio;
		this.ruedas = ruedas;
		this.Motor0 = motor0;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getRuedas() {
		return ruedas;
	}
	public Motor getMotor0() {
		return Motor0;
	}
	@Override
	public String toString() {
		return "COCHE [Color=" + Color + ", precio=" + precio + ", ruedas=" + ruedas + ", Motor0=" + Motor0 + "]";
	}
	
}