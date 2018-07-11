package com.orange.modelo;

import com.orange.modelo.interfacei.IVehiculo;

/***
 * 
 * @desc en la clase moto se va a implementar la interfaz IVehiculo para esto se
 *       debe escribir la palabra reservada implements
 *
 */
public class Moto implements IVehiculo {

	private String marca;
	private String modelo;
	private int cc;

	public Moto(String marca, String modelo, int cc) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cc = cc;
	}

	public Moto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crearVehiculo() {
		System.out.println("se creo una moto");

	}

	@Override
	public void crearVehiculo(String tipo) {
		System.out.println("se creo una moto de tipo " + tipo);

	}

	@Override
	public IVehiculo[] crearVehiculos() {
		// TODO Auto-generated method stub
		return new Moto[5];
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", cc=" + cc + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCc() {
		return cc;
	}
	
	

}