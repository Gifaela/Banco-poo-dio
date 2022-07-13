package br.com.dio.poo;

public interface IConta {
//	INTERFACE É UMA CLASSE ABSTRATA COM TODOS OS MÉTODOS ABSTRATOS 
// 	É UMA CLASSE QUE VAI OBRIGRAR TODAS AS CLASSES QUE EXTENDER ELA, A IMPLEMENTAR TUDO QUE ELA TEM.
// 	NÃO FAZ SENTIDO UMA INTEFACE TER MÉTODOS NÃO PÚBLICOS, ENTÃO MARCAR COMO PÚBLICO SE TORNA REDUNDANTE 
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino) ;
	
	void imprimirExtrato();
}
