import java.util.Scanner;

class Marathon {
	// tienen que completar los métodos e imprimir los resultados en el main

	public static void main(String[] arguments) {
		
		// no va en el metodo main
		String[] names = new String[3];
		int[] times = new int[names.length];
		///////////////////////////////
		
		// el metodo main solo va a tener un menu donde me permita elegir si quiero
		// imprimir el mas rapido
		// imprimir el mas lento
		// imprimir todos los corredores
		
		// otra clase donde se hace todo, todo lo pedido arriba
		
		cargoCorredores(names);

		cargoTiempos(times);
		
		imprimirCorredores(times, names);

		calculoElMasRapido(times, names);

	}
	
	// esto no va a estar en el metodo main
	static void imprimirCorredores(int[] times, String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
	}

	static void cargoCorredores(String[] names) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("Por favor ingrese el nombre del corredor " + (i + 1));
			names[i] = sc.nextLine();
		}
	}

	static void cargoTiempos(int[] times) {
		// cosas con Math.random();
		for (int i = 0; i < times.length; i++) {
			times[i] = (int) (Math.random() * 100);
		}
	}

	static void calculoElMasRapido(int[] times, String[] names) {
		// mas cosas
		int menor = times[0];
		int pos = 0;
		int aux = 0;

		for (int i = 0; i < times.length; i++) {
			if (menor >= times[i]) {
				menor = times[i];
				aux = pos;
				pos = i;
			} // estructura para calcular el más rapido
		}

		// imprimo el mas rapido
		System.out.println("El corredor " + names[pos] + " mas rapido con un tiempo de: " + times[pos]);
		System.out.println("El segundo corredor mas rapido fue " + names[aux] + " con un tiempo de: " + times[aux]);
	///////////////////////////////////////////////
	}
}