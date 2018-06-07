package diagramasDeFlujo;

import java.util.Scanner;

public class Clase6 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quiero guardas cosas dentro del string
		// esto es un constructor...
		int[] var = new int[4];
		sc = new Scanner(System.in);
		for (int i = 0; i < var.length; i++) {
			System.out.println("Ingrese la nota");
			var[i] = sc.nextInt();
		}
//		int sum = 0;
		int prom = 0;
		for (int j = 0; j < var.length; j++) {
			System.out.print(var[j] + " ");
			prom += var[j];
		}
		System.out.println("El promedio es " + prom/((var.length)));
		System.out.println(var.length);
	}
}