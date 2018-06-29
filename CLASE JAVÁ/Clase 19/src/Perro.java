
public class Perro extends Mamifero {

	public Perro(int cantPatas) {
		super(cantPatas);
	}

	@Override
	public String Hablar(String palabra) {
		return palabra;
	}

	@Override
	public String Caminar() {
		return "guau guau";
	}

	@Override
	public String Respirar() {
		return "ajaja";
	}
}
