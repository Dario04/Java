package com.orange.vista;

import com.orange.controlador.FabricaVehiculoControlador;

/***
 * 
 * @desc Estaremos mostrando por la consola los resultados de nuestra aplicacion
 *
 */
public class Test {

	public static void main(String[] args) {

		//generaremos una instancia de nuestro controlador
		FabricaVehiculoControlador fvc = new FabricaVehiculoControlador();
		fvc.creoVehiculo("Moto");
	}

}