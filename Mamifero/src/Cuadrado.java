
public class Cuadrado extends Forma{
String nombre;

	public Cuadrado(String nombre) {
	super();
	this.nombre = nombre;
	lados = 4;
	color = "amarillo";
	esquinas = 4;
}

	@Override
	protected double getArea(double length) {
		// TODO Auto-generated method stub
		return length*length;
	}

	@Override
	protected double getPerimeter(double length) {
		// TODO Auto-generated method stub
		return length*4;
	}

}
