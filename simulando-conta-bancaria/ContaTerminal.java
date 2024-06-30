import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		 int numero;
	     String agencia;
	     String nomeCliente;
	     double saldo;
	        
	        Scanner leitura = new Scanner(System.in);
	        
	        System.out.println("Por favor, digite o numero da conta!");
	        numero = leitura.nextInt();
	        leitura.nextLine();  

	        System.out.println("Por favor, digite o numero da agencia!");
	        agencia = leitura.next();
	        leitura.nextLine(); 
	        
	        System.out.println("Por favor, digite seu nome!");
	        nomeCliente = leitura.nextLine();
	        
	        System.out.println("Por favor, digite seu saldo!");
	        saldo = leitura.nextDouble();
	        
	        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel");
	        
	        leitura.close();
	    
		
		
		
		

	}

}