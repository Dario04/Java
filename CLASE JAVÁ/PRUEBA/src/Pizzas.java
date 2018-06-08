import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pizzaGDM= new Producto(1, 1, 0, 0, 0, 0, 0);
		Producto pizzaDQCJ= new Producto(1, 1, 1, 1, 0, 0, 0);
		Producto pizzaLV= new Producto(1, 0, 0, 0, 1, 1, 1);
		Scanner sc = new Scanner (System.in);
		int option, orden;
		boolean flag = true;
		boolean flag2 = false;
			System.out.println("Marque la opcion deseada");
			System.out.println("1) Grande De Muzarella");
			System.out.println("2) Doble Queso Con Jamon");
			System.out.println("3) La Vegana");
			option = sc.nextInt();
			if (option < 1 || option > 3) {
		        System.err.println("Error, ingrese algo valido");
		        
		        switch (option) {
				case 1:
					System.out.println("La pizza elegida es: Grande De Muzzarella");
					System.out.println(" y sus ingredientes son " + pizzaGDM);
				    break;
				case 2:
					System.out.println("La pizza elegida es: Doble Queso Con Jamon");
					System.out.println(" y sus ingredientes son " + pizzaDQCJ);
				    break;
				case 3:
					System.out.println("La pizza elegida es: La Vegana");
					System.out.println(" y sus ingredientes son" + pizzaLV);
				    break;
				default:
					System.err.println("Error, ingrese una opcion valida");
					orden = sc.nextInt();
			}
	}
}
}
