package random;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Numeros {

	public static void main(String[] args) {

		int contador = 0;

		do {
			Random aleatorio = new Random(System.currentTimeMillis());
			// Producir nuevo int aleatorio entre 0 y 99
			int intAletorio = aleatorio.nextInt(100);
			// Más código

			// Refrescar datos aleatorios
			// aleatorio.setSeed(System.currentTimeMillis());

			contador++;

			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			// System.out.println("Imprimo el número aleatorio generado: " +
			// intAletorio);
			System.out.print(intAletorio + " ");
		} while (contador < 10);

	}

}
