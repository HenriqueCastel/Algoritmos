package Arrays;
/*Faça um programa em que o usuário terá que digitar uma palavra e retorna se é 
palíndromo ou não*/
import java.util.Scanner;

public class Palindromo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra= t.next();
		int x, cont; 
		cont= palavra.length();
		for(x= 0; x < cont; x++) {
			if(palavra.charAt(x) != palavra.charAt(palavra.length() - x - 1)) {
				System.out.println("Não é um palíndromo");
				System.exit(0);
			}
		}
		System.out.println("É um palíndromo");
		t.close();
	}

}
