package ordenoVector;

import java.util.Random;

public class Insercion {

	public static void main(String[] args) {

		int[] var = new int[100];

		cargoVector(var);

		imprimoVector(var);

		ordenoVector(var);

		System.out.println(" ");
		System.out.println("////////////////Ahora ordenado////////////////");

		imprimoVector(var);

	}// aca termina el metodo main

	public static void cargoVector(int[] var) {
		for (int i = 0; i < var.length; i++) {
			Random aleatorio = new Random(System.currentTimeMillis());

			// Producir nuevo int aleatorio entre 0 y 99
			int intAletorio = aleatorio.nextInt(100);

			// Refrescar datos aleatorios
			// aleatorio.setSeed(System.currentTimeMillis());

			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			var[i] = intAletorio;

		}

	}// aca termina el metodo cargoVector()

	public static void ordenoVector(int[] var) {
		int valor = var[0];
		int guardo = 0;

		for (int i = 1; i < var.length; i++) {

			if (valor < var[i]) {
				guardo = var[i];
				var[i] = valor;
				valor = guardo;
			}

		}

	}// aca termina el metodo ordenoVector()

	public static void imprimoVector(int[] var) {
		for (int i = 0; i < var.length; i++) {
			System.out.print(var[i] + " ");
		}
	}// aca termina el metodo imprimoVector()
}