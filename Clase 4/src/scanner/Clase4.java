package scanner;

import java.util.Scanner;

public class Clase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La progamacion estructurada es mas dificil de leer que la
		// la progamacion en estado de objetos
		// el while hace todo una vez mientre que el do{while lo hace mas veces.
		// Scanner es un objeto.
		// hay variables estructuradas y a orientado a objetos objeto.
		// variables primitivas: boolean, int, char, float, double, byte, long,
		// short.
		// Scanner sc = new Scanner(System.in);
		// Scanner sc1 = new Scanner(System.in);
		// Scanner sc2 = new Scanner(System.in);
		// int num = 0;
		// String pal = "string";
		// double com = 3.00;
		// System.out.println("ingrese numero: ");
		// num = sc.nextInt();
		// System.out.println("ingrese string: ");
		// pal = sc1.nextLine();
		// System.out.println("ingrese Double: ");
		// com = sc2.nextDouble();
		// System.out.println(num);
		// Preguntar S o N mientras no haya contestado una opcion valida
		Scanner sc = new Scanner(System.in);
		String con;
		con = sc.nextLine();
		if (con.equalsIgnoreCase("S")) {

			System.out.println("ingreso S!");
		} else {
			System.out.println("ingreso N!");
		}
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Ingresa Whatever: ");
		//char c = sc.next().charAt(0);
		
		//System.out.println("Ingresaste: " + c);

	}
	// if (con.equalsIgnoreCase("N"));
	// System.out.println("Ingreso NO");
}
