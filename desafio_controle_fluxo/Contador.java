package desafio_controle_fluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			
		contar(num1,num2);	
			
		}catch(ParametrosInvalidosException e) {
			System.out.println("Erro: "+e);
		}
		
		
	}

	public static void contar(int num1, int num2) throws ParametrosInvalidosException  {
		
		int cont = num2-num1;
		
		if(cont<0) {
			throw new ParametrosInvalidosException();
		}
		
		while(cont>=0) {
			System.out.println("Imprimindo o numero "+num1);
			num1++;
			cont--;
		}
		
	}

}


