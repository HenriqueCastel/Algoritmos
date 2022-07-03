package Vetor;
/*Faça um programa que lê 10 valores inteiros e mostra os valores ordenados;*/
import java.util.Scanner;

public class ValoresOrdenados {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i, o, menorvalor= 999, posicao= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		for(o= 0; o < 10; o++) {
			for(i= 0; i < 10; i++) {
				if(menorvalor > x[i]) {
					menorvalor= x[i];
					posicao= i;
				}
			}
			System.out.println(x[posicao]);
			x[posicao]= 999;
			menorvalor= 999;
		}
		t.close();
	}

}
