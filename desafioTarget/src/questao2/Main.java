package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a frase: ");
		String frase = scan.nextLine();
		
		char caractereAlvo = 'a';
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == caractereAlvo) {
				cont++;
			}
		}
		
		System.out.println("A Frequencia da letra A é: "+cont);
		
	}

}
