package Metodos;
/*Faça um programa que tem um método que recebe como parâmetro um número e mostra a
tabuada deste número.*/
import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um número:");
		numero= t.nextInt();
		tabuada(numero);
		t.close();
	}
	public static void tabuada(int numero) {
		int i;
		for(i= 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
