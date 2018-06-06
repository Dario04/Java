package clase8;

import java.util.Scanner;

public class Clase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ejecutarMenu();
		
		System.out.println("GRACIAS");
}
		public static void ejecutarMenu() {
			Scanner sc = new Scanner (System.in);
			Scanner sc2 = new Scanner (System.in);
			Scanner sc3 = new Scanner (System.in);
			Scanner sc4 = new Scanner (System.in);
			int num1, num2, option;
			boolean flag = true;
			boolean flag2 = false;
			String orden;
	do {
		System.out.print("Ingrese un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Ingrese un numero: ");
		num2 = sc.nextInt();
	do {
		do{
		System.out.println("Marque la opcion deseada");
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		
		option = sc3.nextInt();
		
		if (option < 1 || option > 4) {
        System.err.println("Error, ingrese algo valido");
		switch (option) {
		case "1":
			//este es un caso que se va a ejecutar cuando el dato ingresado no este contemplado
			//en un caso. Es opcional en una estructura.
			System.out.println("El resultado es: "  + (num1 + num2));
		    break;
		case "2":
			System.out.println("El resultado es: "  + (num1 - num2));
		    break;
		case "3":
			System.out.println("El resultado es: "  + (num1 * num2));
		    break;
		case "4":
			System.out.println("El resultado es: "  + (num1 / num2));
		    break;
		
		default:
			System.err.println("Error, ingrese una opcion valida");
			orden = sc.nextInt();
			if(orden.equalsIgnoreCase("si")){
				flag=true;
			}else{
				flag=false;
			}
		}while (flag); {
     } 
		}
