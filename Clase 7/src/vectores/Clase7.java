package vectores;

import java.util.Random;

public class Clase7 {

	public static void main(String[] args) {
		int[] var = new int[100];

		cargovector(var);
		
		ordenovector(var);
		
		imprimovector(var);
//		System.out.println(" ");
//		System.out.println("Mi valor esta cargado con: ");
//		for (int i = 0; i < var.length; i++){
//		System.out.print(var[i] + " ");
		}


	public static void cargovector(int[] var) {
		int i = 0;

		do {
			Random aleatorio = new Random(System.currentTimeMillis());
			int intAleatorio = aleatorio.nextInt(100);

			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			var[i] = intAleatorio;
			i++;
			System.out.print(intAleatorio + " ");
		} while (i < var.length);
	}

	public static void imprimovector(int[] var) {
		for (int i = 0; i < var.length; i++){
		System.out.print(var[i] + " ");
		}
		public static void ordenovector(int[] var) {
			int valorMasChico = 0;
			int valorMasGrande = 0;
	}
	
	
}