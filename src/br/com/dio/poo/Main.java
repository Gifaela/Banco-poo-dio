package br.com.dio.poo;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente giulia = new Cliente();
		giulia.setNome("Giulia");
		
		Conta cc = new ContaCorrente(giulia); // Já gera agencia e número 
		Conta cp = new ContaPoupanca(giulia); 
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
