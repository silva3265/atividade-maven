package br.com.devvita;

public class Cliente {

	public static void main(String[] args) {

		Conta conta1 = new Conta("Rômulo", 001, "2563-01", 0.0);
		Conta conta2 = new Conta("Gustavo", 005, "3656-07", 0.0);

		conta1.depositar(700.0);
		conta1.sacar(500.0);

		conta1.transferir(conta2, 50.0);

		conta1.imprimirDemonstrativo();

		System.out.println("============================");

		System.out.println("Valor Tranferido: ");

		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());

	}

}
