package Vetor;
/*Faça um programa que lê 10 valores, armazena no vetor A e mostra a soma dos 
valores.*/
import java.util.Scanner;

public class SomaDe10valores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] A= new int[10];
		int i, soma= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			A[i]= t.nextInt();
			soma= A[i] + soma;
		}
		System.out.println("A soma entre os números é: " + soma);
		t.close();
	}

}
