package br.com.xti;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	public Carro(){
	}

	public Carro (String modelo, int velocidadeMaxima, double segundosZeroACem) {
	this.modelo = modelo;
	this.velocidadeMaxima = velocidadeMaxima;
	}
	public Carro (String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;
	}
}
