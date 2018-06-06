
public class primerVistazo {

	public static void main(String[] Args) {
		//creo edificio
		edificio medrano = new edificio(100, 45, "Marmol", 150);
		
		System.out.println(medrano);
		
		System.out.println("El precio sera de: $" + medrano.precio());
		
		
	} // Cierre del main

} // Cierre de la clase
