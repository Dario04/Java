package com.orange.modelo;

import com.orange.modelo.interfacei.IVehiculo;

/***
 * 
 * @desc se va a implementar la interfaz IVehiculo esto nos va a servir para
 *       crea autos de tipo X recordemos que se debe utilizar la plabra
 *       reservada implements
 * 
 */
public class Auto implements IVehiculo {

	private String marca;
	private String color;

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String color) {
		super();
		this.marca = marca;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void crearVehiculo() {
		System.out.println("creo una auto");

	}

	@Override
	public void crearVehiculo(String tipo) {
		System.out.println("creo un auto de tipo " + tipo);

	}

	@Override
	public IVehiculo[] crearVehiculos() {

		return new Auto[5];
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + "]";
	}

}