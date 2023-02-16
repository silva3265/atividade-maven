package br.com.devvita;


public class Cliente {
	
	public static void main(String[] args) {
        
        Conta conta1 = new Conta("Rômulo", 001, "2563-01", 1500.0);
        Conta conta2 = new Conta("Gustavo", 005, "3656-07", 1800.0);

        conta1.depositar(100);
        conta1.sacar(500);
        conta2.depositar(500);
        
     
        conta1.transferir(conta2, 600.00);
			
		
        conta2.imprimirDemonstrativo();
        
        System.out.println("============================");
        
        System.out.println("Valor Tranferido: ");
        
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

      
    } 
	
	

}
