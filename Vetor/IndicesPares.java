package Vetor;
/*Faça um programa que armazena 10 valores em um vetor X e mostra somente os valores 
armazenados nos índices pares do vetor.*/
import java.util.Scanner;

public class IndicesPares {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] X= new int[10];
		int i;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			X[i]= t.nextInt();
		}
		for(i= 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(X[i]);
			}
		}
		t.close();
	}

}
