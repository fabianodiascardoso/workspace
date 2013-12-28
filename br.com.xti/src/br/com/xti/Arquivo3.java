package br.com.xti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Arquivo3 {
			Path path = Paths.get("C:/Users/tesouraria4/workspace/xti/files/texto.txt");
			Charset utf8 = StandardCharsets.UTF_8;
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
			
			try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas){
				writer.write(conta.getCliente() +";" + conta.getSaldo() + "\n");
			}
		}
	}
	public ArrayList<Conta> lerContas() throws IOException {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine())!= null){
			String[] t = line.split(";");
				System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
	return contas;
	}
	public static void main(String[] args) throws IOException {
		
/*		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta ("Ricardo", 1500.00));
		contas.add(new Conta ("Joao", 1000.00));
		contas.add(new Conta ("Luciano", 1100.00));
		contas.add(new Conta ("Fabiano", 1200.00));
		contas.add(new Conta ("Marcia", 1300.00));
		contas.add(new Conta ("Rodrigo", 1400.00));
		*/
		Arquivo3 operacao = new Arquivo3();
	//	operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.lerContas();
		for (Conta conta : contas2){
			conta.exibeSaldo();
			
		}
		}
	
		
	}


