package Metodos;
/*Faça um programa que tem um método recebe como parâmetro uma string, criptografa a 
frase alterando todas as vogais por #.*/
import java.util.Scanner;

public class SubstituicaoDasVogais {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		System.out.println(troca(palavra));
		t.close();
	}
	public static String troca(String palavra) {
		palavra= palavra.replace("a", "#");
		palavra= palavra.replace("e", "#");
		palavra= palavra.replace("i", "#");
		palavra= palavra.replace("o", "#");
		palavra= palavra.replace("u", "#");
		         return palavra;
	}

}
