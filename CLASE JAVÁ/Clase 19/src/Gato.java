
public class Gato extends Mamifero {

	public Gato(int cantPatas) {
		super(cantPatas);
	}

	@Override
	public String Hablar(String palabra) {
		return palabra;
	}
	@Override
	public String Caminar() {
		return "miau miau";
	}

	@Override
	public String Respirar() {
		return "prrrr";
	}
}
