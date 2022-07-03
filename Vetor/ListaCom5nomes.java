package Vetor;
/*Faça um programa que armazena 5 nomes em um vetor e mostra uma lista numerada com os
nomes.*/
import java.util.Scanner;

public class ListaCom5nomes {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String nome[]= new String[5];
		int i;
		System.out.println("Digite cinco nomes:");
		for(i= 0; i < 5; i++) {
			nome[i]= t.next();
		}
		for(i= 0; i < 5; i++) {
			System.out.println(i + 1 + "- " + nome[i]);
		}
		t.close();
	}

}
