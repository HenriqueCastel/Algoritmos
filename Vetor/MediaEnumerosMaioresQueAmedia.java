package Vetor;
/*Faça um programa que lê 10 números, calcula a média e ao final mostra quantos 
valores são maiores que a média e os números.*/
import java.util.Scanner;

public class MediaEnumerosMaioresQueAmedia {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int[] y= new int[10];
		int i, soma= 0, cont= 0, cont2= 0;
		double media;
		System.out.println("Digite 10 números:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
			soma= soma + x[i];
			cont++;
		}
		for(i= 0; i < 10; i++) {
			media= soma / cont;
			if(x[i] > media) {
				cont2++;
				y[cont2 - 1]= x[i];
			}
			}
		System.out.println(cont2 + " números são maiores que a média: ");
		System.out.println("Números maiores que a média: ");
		for(i= 0; i < cont2; i++) {
			System.out.println(y[i]);
		    t.close();
		}
	}

}
