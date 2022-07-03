package Vetor;
/*Faça um programa que lê 10 valores e armazena em um vetor, mostra o 1o valor e o 5o 
valor digitado.*/
import java.util.Scanner;

public class PrimeiroEquintoValor {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] valor= new int[10];
		int i;
		System.out.println("Digite 10 números:");
		for(i= 0; i < 10; i++) {
			valor[i]= t.nextInt();
		}
		System.out.println("O primeiro valor digitado foi " + valor[0] + " e o quinto "
				+ "foi " + valor[4]);
		t.close();
	}

}
