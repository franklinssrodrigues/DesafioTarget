package questao1;

import java.util.Iterator;
import java.util.Scanner;

public class Calculadora {
	
	public static void fibonacci() {
		
		int num1 = 0;
		int num2 = 1;
		int prox = 0;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor referência: ");
		int referencia = scan.nextInt();
		
		
		while( prox <= referencia) {
		
			
			prox = num1 + num2;
					
					
			
			if(prox == referencia) {
				System.out.println("O valor se encontra na sequencia");
				break;
			}			
			
			else if(prox > referencia){
				System.out.println("O valor não se encontra na lista");
				break;
			}
			
			num1 = num2;
			num2 = prox;
		}
		
		
			
			//System.out.println(prox);
			
			
		}
		
		
	}

