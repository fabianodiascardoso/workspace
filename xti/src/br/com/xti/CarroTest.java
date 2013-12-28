package br.com.xti;

public class CarroTest {

	public static void main(String[] args) {


		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12;
		
		Carro K = new Carro("Koenigsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 1018);
		K.motor = v8;
		
		System.out.println(K.motor.potencia);

	}

}
