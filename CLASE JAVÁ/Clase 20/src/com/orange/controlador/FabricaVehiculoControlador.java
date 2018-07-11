package com.orange.controlador;

import com.orange.modelo.Auto;
import com.orange.modelo.Moto;
import com.orange.modelo.interfacei.IVehiculo;

/***
 * 
 * @desc En esta clase estaremos creando vehiculos a partir de cierto atributo
 *
 */

public class FabricaVehiculoControlador {

	/***
	 * Patron de diseño creacion Factoria abstracta: a partir de una clase
	 * abstracta o interfaz se crea una instanacia del objeto que se extendiende
	 * o implementa
	 */
	public void creoVehiculo(String tipoVehiculo) {

		IVehiculo vehiculo1 = null;
		/*
		 * Nosotros utilizamos como plantilla la interfaz para crear un objeto
		 * vamos a tener una instancia de la clase implementada solo con los
		 * metodos de la interfaz
		 */

		switch (tipoVehiculo.toLowerCase()) { // a partir de la JDK 1.7 se
												// permite que el switch se
												// pueda trabajar con String
		case "auto":
			vehiculo1 = new Auto();
			break;
		case "moto":
			vehiculo1 = new Moto("Honda", "GoldWind", 1900);
			break;
		default:
			System.out.println("Ese tipo lo desconozco");
			break;
		}

		vehiculo1.crearVehiculo();
		vehiculo1.crearVehiculo("Deportivo");

		// utulizo el metodo que de tipo vector donde en cada dimension le cargo
		// un obj
		// trabajar con la instancia del switch() --> auto
		IVehiculo[] vList = vehiculo1.crearVehiculos();
		if (vehiculo1 instanceof Auto) {
			Auto a1 = (Auto) vehiculo1;
			vList[0] = new Auto("Ferrari", "Roja");
			vList[1] = new Auto("McLaren", "Azul");
			vList[2] = new Auto("Fiat", "blanco");
			vList[3] = new Auto("Chevrolet", "Negro");
			vList[4] = new Auto("Daewo", "celeste");
			for (int i = 0; i < vList.length; i++) {
				System.out.println(vList[i]); // invocar a la instancia en particular al toString()
			}
		}

		// imaginando que estamos en la instancia de una moto

		if (vehiculo1 instanceof Moto) {
			vList[0] = new Moto("Rouser", "NS200", 200);
			vList[1] = new Moto("Duke", "390", 390);
			vList[2] = new Moto("Honda", "Twister", 250);
			vList[3] = new Moto("Yamaha", "Ninja", 300);
			vList[4] = new Moto("Corven", "Ts150", 150);

			for (int i = 0; i < vList.length; i++) {
				System.out.println(vList[i]);
			}
			Moto m1 = (Moto) vehiculo1;
			System.out.println("La marca es: " + m1.getMarca());
			System.out.println("El modelo es: " + m1.getModelo());
			System.out.println("Las cilindradas son: " + m1.getCc());
		}

	}

}