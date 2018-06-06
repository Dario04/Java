import java.util.Scanner;

public class NumImpPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // "%" --> es un operando que calcula el resto de una division. Ej: 4 % 2 = 0
		int numero = 17;
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		}else {
				System.out.println("El numero " + numero + " es inmpar");
				// Aca creé la variable 'var' tipo objeto Scanner.
				Scanner var = new Scanner (System.in);
				numero = var.nextInt();
				// "Java.util.Scanner"
				// si queremos ingresar un valor por teclado tenemos que usar el tipo de
				// variable objeto Scanner. El proceso consta de 2 partes, la primera crear la variable
				// tipo Scanner usando el constructor, luego utilizaremos junto a nuestra variable
				// el metodo que nos permita ingresar el tipo de dato deseado.
				// nota: si el metodo utilizado es para ingresar un entero (un nextInt();) la variable 
				// donde alojaremos el ingresado debera ser del mismo tipo ( nextInt(); )
				// Ctrl + Shift + O
			}
		}
	}

