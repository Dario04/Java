package pseudoCodigo;

public class PseudoCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JVM (Java Virtual Machine) corre cualquier archivo .JAVA en cualquier
		// plataforma
		// JRE (Java Runtime Enviroment)
		// JDK (Java Developer Kit)
		// buscar diferencia entre progamacion estructurada y orientada a
		// objetos
		// diferecia de la orientacion a objeto de la progamacion estructurada:
		// es mas facil de debugear, se puede reutilizar el codigo,
		// tiene una mejor organizacion
		// do{Procedimiento}while
		// int C;
		// C = 0;
		// int sum = 0;
		// Hacer
		// do{
		// System.out.print(C + " ");
		// C++;
		// //Hacer
		// }while(C<101);
		// System.out.println("");
		// int K;
		// K = 100;
		// do{
		// System.out.print(K + " ");
		// K--;
		// }while(K>-1);
		// System.out.println("");
		// do {
		// sum += C;
		// C++;
		// } while (C < 101);
		// System.out.println(" ");
		// System.out.print("La suma es " + sum);
		int num = 0;
		int contar = 0;
		do{
			
		if (num%2!=0){
				
			System.out.println("El numero " + num + " es impar");
		    contar++;
		}
		num++;
		}while (num<101);
		System.out.println("Son " + contar + " impares");
	}
}
