package Vetor;
/*Criar um algoritmo que leia dois vetores A e B, contendo, cada um 25 elementos 
inteiros. Intercale esses dois conjuntos (A[1]/B[1]/A[2]/B[2]/...), formando um vetor V
de 50 elementos. Imprima o vetor V.*/
import java.util.Scanner;

public class DoisVetoresEmUm {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] A= new int[5];
		int[] B= new int[5];
		int[] V= new int[10];
		int i;
		for(i= 0; i < 5; i++) {
			System.out.println("Digite o valor de A:");
			A[i]= t.nextInt();
			A[i]= V[i];
			System.out.println("Digite o valor de B:");
			B[i]= t.nextInt();
			B[i]= V[i];
		}
		for(i= 0; i< 10; i++) {
			System.out.println(V[i]);
		}
		t.close();
	}

}
