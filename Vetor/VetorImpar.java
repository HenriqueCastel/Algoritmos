package Vetor;
/*Faça um programa que leia 50 valores inteiros positivos e crie a partir dele um 
vetor com os valores ímpares. Ao final imprima o vetor original e, se houver valores 
ímpares no vetor original, imprima o vetor de ímpares, caso contrário dê apenas uma 
mensagem de que não há valores ímpares a apresentar.*/
import java.util.Scanner;

public class VetorImpar {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[50];
		int[] impar= new int[50];
		int i;
		System.out.println("Digite 50 valores inteiros positivos:");
		for(i= 0; i < 50; i++) {
			x[i]= t.nextInt();
			if(x[i] % 2 != 0) {
				impar[i]= x[i];
			}
		}
		for(i= 0; i < 50; i++) {
			if(impar[i] % 2 != 0) {
				System.out.println(impar[i]);
			}
		}
		System.out.println("Não há valores ímpares a apresentar");
		t.close();
	}

}
