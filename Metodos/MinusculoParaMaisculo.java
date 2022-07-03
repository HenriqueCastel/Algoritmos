package Metodos;
/*Faça um programa que tem um método que recebe como parâmetro uma string e transforma 
todas as letras da frase em maiúsculo.*/
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
