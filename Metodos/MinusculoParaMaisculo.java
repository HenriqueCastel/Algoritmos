package Metodos;
/*Fa�a um programa que tem um m�todo que recebe como par�metro uma string e transforma 
todas as letras da frase em mai�sculo.*/
import java.util.Scanner;

public class MinusculoParaMaisculo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		minuscula(palavra);
		t.close();
	}
	public static void minuscula(String palavra) {
		String maiscula= palavra.toUpperCase();
		System.out.println(maiscula);
	}

}
