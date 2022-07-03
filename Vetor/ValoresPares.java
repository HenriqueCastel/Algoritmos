package Vetor;
/*Faça um programa que lê 10 valores, armazena em um vetor X. Verifica os valores 
pares digitados, armazena em um vetor Y mostra os valores pares digitados e a 
quantidade.*/
import java.util.Scanner;

public class ValoresPares {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int[] y= new int[10];
		int i, cont= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		    if(x[i] % 2 == 0) {
		    	cont++;
		    	y[cont - 1]= x[i];
		    }
		}
		System.out.println("Os valores pares são: ");
		for(i= 0; i < cont; i++) {
			System.out.println(y[i]);
		}
		System.out.println("Foram digitados " + cont + " números pares");
		t.close();
	}

}
