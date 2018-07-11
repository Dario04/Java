package com.orange.modelo.interfacei;

/***
 * 
 * @desc: creacion de vehiculo e La interfaz se implementa en las clases Java
 *        permite la implementacion de multiples interfaces la interfaz tiene
 *        todos sus metodos abstractos esto quiere decir que no se va a
 *        implementar en la interfaz a no ser que trabajemos con java 1.8 en
 *        cual existen los metodos default
 */
public interface IVehiculo {
	// JDK 1.5.10 quedo obsoleto escribi abstract
	
	/***
	 * @desc: creamos un vehiculo
	 */
	public void crearVehiculo();

	/**
	 * 
	 * @param tipo : seria el tipo de vehiculo que quiere crear
	 */
	public void crearVehiculo(String tipo);

	/***
	 * 
	 * @return estara devolviendo una lista de vehiculos
	 */
	public abstract IVehiculo[] crearVehiculos();

}