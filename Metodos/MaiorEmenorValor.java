package Metodos;
/*Desenvolva uma fun��o que receba tr�s valores, a, b e c, retorne o MAIOR e o MENOR 
valor desses tr�s. Deve ser elaborado um programa para utilizar tal fun��o lendo os 
tr�s valores e imprimindo o maior e o menor valor computado.*/
import java.util.Scanner;

public class MaiorEmenorValor {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o valor de a:");
		a= t.nextInt();
		System.out.println("Digite o valor de b:");
		b= t.nextInt();
		System.out.println("Digite o valor de c:");
		c= t.nextInt();
		maiorEmenor(a, b, c);
		t.close();
	}
	public static void maiorEmenor(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println("O maior valor � o de a: " + a);
		}else {
			if(b > a && b > c) {
				System.out.println("O maior valor � o de b: " + b);
			}else {
				System.out.println("O maior valor � o de c: " + c);
			}	
		}
		if(a < b && a < c) {
			System.out.println("O menor valor � o de a: " + a);
		}else {
			if(b < a && b < c) {
				System.out.println("O menor valor � o de b: " + b);
			}else {
				System.out.println("O menor valor � o de c: " + c);
			}	
		}
	}

}
