package Vetor;
/*Cria um algoritmo que armazena números em dois vetores de inteiros de cinco 
elementos cada. Mostra o resultado da soma dos vetores.*/
import java.util.Scanner;

public class SomaDeDoisVetores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[5];
		int[] y= new int[5];
		int i, somax= 0, somay= 0, soma= 0;
		System.out.println("Digite 5 valores:");
		for(i= 0; i < 5; i++) {
			x[i]= t.nextInt();
			somax= x[i] + somax;
		}
		System.out.println("Digite 5 valores:");
		for(i= 0; i < 5; i++) {
			y[i]= t.nextInt();
			somay= y[i] + somay;
			soma= somax + somay;
		}
		System.out.println("A soma dos dois vetores é " + soma);
		t.close();
	}

}
