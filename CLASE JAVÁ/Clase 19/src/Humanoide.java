
public class Humanoide extends Mamifero {

	public Humanoide(int cantPatas) {
		super(cantPatas);
	}

	@Override
	public String Hablar(String palabra) {
		return palabra;
	}

	@Override
	public String Caminar() {
		return "estoy caminando";
	}

	@Override
	public String Respirar() {
		return "estoy respirando";
	}
}
