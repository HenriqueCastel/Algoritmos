package Básico;
/*Faça um programa que retorna o número digitado, seguido de seu sucessor e 
antecessor.*/
import java.util.Scanner;

public class SucessorAntecessor {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero, sucessor, antecessor;
		System.out.println("Digite um número:");
		numero= t.nextInt();
		sucessor= numero + 1;
		antecessor= numero - 1;
		System.out.println("Número: " + numero + ", sucessor: " + sucessor + 
				", antecessor: " + antecessor);
		t.close();
	}

}
