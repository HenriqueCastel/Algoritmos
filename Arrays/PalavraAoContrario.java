package Arrays;
/*Faça um algoritmo que entre com uma palavra e imprima conforme o exemplo a 
seguir: 
palavra: PAZ
imprime:
P
A
Z
imprime: ZAP.*/
import java.util.Scanner;

public class PalavraAoContrario {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		int i;
		for(i= 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		for(i= palavra.length() - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
		t.close();
	}

}
