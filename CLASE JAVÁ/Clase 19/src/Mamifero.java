
public abstract class Mamifero {
	protected int cantPatas;

	public abstract String Hablar(String palabra);

	public abstract String Caminar();

	public abstract String Respirar();

	public Mamifero(int cantPatas) {
		this.cantPatas = cantPatas;
	}

	public int getCantPatas() {
		return cantPatas;
	}
}
