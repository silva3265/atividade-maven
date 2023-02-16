package br.com.devvita;

public class Conta implements Banco {

	/* Atributos */
	protected String nome;
	protected int agencia;
	protected String numero;
	protected double saldo;
	protected double tranferencia;

	/* Construtor com Parametros */
	public Conta(String nome, int agencia, String numero, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;

	}

	/* Getters e Setters */
	public String getNome() {
		return nome;
	}

	public double getTranferencia() {
		return tranferencia;
	}

	public void setTranferencia(double tranferencia) {
		this.tranferencia = tranferencia;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	/* Metodo Sacar */
	public void sacar(double valorSaque) {
		saldo -= valorSaque;

	}

	/* Metodo Depositar */
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;

	}

	/* Metodo Tranferir */
	public void transferir(Conta outraConta, double valor) {
		if (valor <= saldo) {
			sacar(valor);
			outraConta.depositar(valor);
		}
	}

	public void imprimirDemonstrativo() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Numero da Conta: " + getNumero());
		System.out.println("Saldo: " + getSaldo());

	}

}
