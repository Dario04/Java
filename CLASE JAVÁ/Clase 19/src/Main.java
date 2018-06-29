import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner patas = new Scanner(System.in);
		Scanner palabra = new Scanner(System.in);
		
		System.out.println("El menu de Dios");
		System.out.println("¿Que mamifero desea crear hoy?");
		System.out.println("1 --> Perro \n2 --> Gato \n3 --> Humano");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Cuantas patas desea que tenga su Perro?");
			Perro primerPerro = new Perro(patas.nextInt());
			System.out.println("Excelente majestad, lo hemos creado\nEl mismo sabe ladrar, caminar y respirar.");
			System.out.println(primerPerro.Hablar("guau guau guau guau"));
			System.out.println("Respira " + primerPerro.Respirar());
			System.out.println("Camina " + primerPerro.Caminar());
			break;
		case 2:
			System.out.println("Cuantas patas desea que tenga su Gato?");
		    Gato primerGato = new Gato(patas.nextInt());
		    System.out.println("Excelente majestad, lo hemos creado\nEl mismo sabe maullar, caminar y respirar.");
		    System.out.println(primerGato.Hablar("miau miau miau miau"));
			System.out.println("Respira " + primerGato.Respirar());
			System.out.println("Camina " + primerGato.Caminar());
		    break;
		case 3:
			System.out.println("Cuantas patas desea que tenga su Humano?");
		    Humanoide primerHumano = new Humanoide(patas.nextInt());
		    System.out.println("Excelente majestad, lo hemos creado\nEl mismo sabe hablar, caminar y respirar.");
		    System.out.println(primerHumano.Hablar("Hola, soy un humano"));
			System.out.println("Respira " + primerHumano.Respirar());
			System.out.println("Camina " + primerHumano.Caminar());
		    break;
		default:
			break;
				
		}
	}

}
