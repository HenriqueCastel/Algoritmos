package Metodos;
/*Faça um programa que tem um método recebe como parâmetro uma string e retorna 
indicando se essa string é palíndromo.*/
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
				return "Não é palíndromo";
			} else {
				return "É palíndromo";
			}
		}
		return numero;
	}
}

