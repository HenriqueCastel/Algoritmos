package Arrays;
/*Fa�a um programa em que o usu�rio ter� que digitar uma palavra e retorna se � 
pal�ndromo ou n�o*/
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
				System.out.println("N�o � um pal�ndromo");
				System.exit(0);
			}
		}
		System.out.println("� um pal�ndromo");
		t.close();
	}

}
