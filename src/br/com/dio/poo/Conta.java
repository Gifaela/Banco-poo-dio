package br.com.dio.poo;

//	CLASSE ABSTRATA PARA NINGUÉM INSTANCIAR ELA, POIS NÃO FAZ SENTIDO DAR UM NEW EM UMA CLASSE GENERICA(SEM DEFINIR SE É POUPANÇA OU CORRENTE) 
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADAO = 001;
	private static int SEQUENCIAL = 1;

//	ATRIBUTOS
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

//	CONSTRUTOR PADRÃO -> SUBESCREVER
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

//	IMPLEMENTANDO OS MÉTODOS ABSTRATOS DA INTERFACE IConta 
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor; // saldo = saldo - valor OU saldo -= valor
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor; // saldo = saldo + valor OU saldo += valor
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

//	MÉTODOS GETTERS 
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d ", this.agencia));
		System.out.println(String.format("Número: %d ", this.numero));
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
	}
}
