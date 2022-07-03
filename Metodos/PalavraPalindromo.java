package Metodos;
/*Fa�a um programa que tem um m�todo recebe como par�metro uma string e retorna 
indicando se essa string � pal�ndromo.*/
import java.util.Scanner;

public class PalavraPalindromo {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String numero = t.next();
		System.out.println(palindromo(numero));
		t.close();
	}
	public static String palindromo(String numero) {
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) != numero.charAt(numero.length() - i - 1)) {
				return "N�o � pal�ndromo";
			} else {
				return "� pal�ndromo";
			}
		}
		return numero;
	}
}

