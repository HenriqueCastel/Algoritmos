package Metodos;
/*Faça uma função que efetue a TROCA dos valores de a por b, recebidos como parâmetro. 
Ou seja, essa função deve substituir o valor de a pelo de b, e reciprocamente. 
Desenvolva também um programa que leia dois valores quaisquer, e imprima os valores 
após a chamada da função TROCA.*/
import java.util.Scanner;

public class TrocaDeValores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int a, b;
		System.out.println("Digite o valor de A:");
		a= t.nextInt();
		System.out.println("Digite o valor de B:");
		b= t.nextInt();
		troca(a, b);
		t.close();
	}
	public static void troca(int a, int b) {
		a= b;
		b= a;
		System.out.println("A: " + a + ", B: " + b);
	}

}
