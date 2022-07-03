package Vetor;
/*Faça um programa que calcula o produto de dois vetores inteiros.*/
import java.util.Scanner;

public class ProdutoDeDoisVetores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int[] y= new int[10];
		int i, produto= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			y[i]= t.nextInt();
			produto= produto + (x[i] * y[i]);
		}
		System.out.println("O produto dos vetores é " + produto);
		t.close();
		}
	
}
