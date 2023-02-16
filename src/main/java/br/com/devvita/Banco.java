package br.com.devvita;

public interface Banco {

	public void sacar(double valor);
	public void depositar(double valor);
	public void transferir(Conta outraConta, double valor);

}
 