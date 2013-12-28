package br.com.xti;

public class Conta {

	private String cliente;
	private double saldo;
	
public Conta(){}
public Conta(String cliente, double saldo){
	this.cliente = cliente;
	this.saldo = saldo;
	
}
		void exibeSaldo() {
			System.out.println(cliente + " seu saldo é " + saldo);
	}

	void saca(double valor){
		//ver se tem autorização
		//se limite do dia não foi ultrapassado
		//se tem saldo na conta
		//deduzir valor do saque
		//atualizar registros do banco
		//entregar o dinheiro ao cliente
		saldo -= valor;
		}
	void deposita(double valor){
		saldo += valor;
		
	}
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
}
