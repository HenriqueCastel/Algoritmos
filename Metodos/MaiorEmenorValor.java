package Metodos;
/*Desenvolva uma função que receba três valores, a, b e c, retorne o MAIOR e o MENOR 
valor desses três. Deve ser elaborado um programa para utilizar tal função lendo os 
três valores e imprimindo o maior e o menor valor computado.*/
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
			System.out.println("O maior valor é o de a: " + a);
		}else {
			if(b > a && b > c) {
				System.out.println("O maior valor é o de b: " + b);
			}else {
				System.out.println("O maior valor é o de c: " + c);
			}	
		}
		if(a < b && a < c) {
			System.out.println("O menor valor é o de a: " + a);
		}else {
			if(b < a && b < c) {
				System.out.println("O menor valor é o de b: " + b);
			}else {
				System.out.println("O menor valor é o de c: " + c);
			}	
		}
	}

}
