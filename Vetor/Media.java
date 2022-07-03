package Vetor;
/*Faça um programa que lê 10 valores de um vetor e apresenta a média aritmética desses
valores*/
import java.util.Scanner;

public class Media {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i, cont= 0; 
		double soma= 0, media= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
			soma= soma + x[i];
			cont++;
			media= soma / cont;
		}
		System.out.println("A média dos valores é " + media);
		t.close();
	}

}
