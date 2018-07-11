package com.orange.modelo;

	import com.orange.modelo.interfacei.IVehiculo;

	/***
	 * 
	 * @desc: en la clase Camion se va a implementar la interfaz IVehiculo para esto
	 *        se debe escribir la palabra reservada "implements"
	 *
	 */
	public class Camion implements IVehiculo {

		@Override
		public void crearVehiculo() {
			// TODO Auto-generated method stub
			System.out.println("se creo un Camion");
		}

		@Override
		public void crearVehiculo(String tipo) {
			System.out.println("se creo un Camion de tipo " + tipo);
			// TODO Auto-generated method stub

		}

		@Override
		public IVehiculo[] crearVehiculos() {
			// TODO Auto-generated method stub
			IVehiculo[] vList = new Camion[5];
			return vList;
		}

	}

