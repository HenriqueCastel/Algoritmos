package Vetor;
/*Desenvolva um algoritmo que permita a leitura de dez valores, salve em um vetor de
10 elementos e gere um segundo vetor com os mesmos dados, só que de maneira invertida,
ou seja, o primeiro elemento ficará na última posição, o segundo na penúltima posição,
e assim por diante. Ao final, imprima o novo vetor.*/
import java.util.Scanner;

public class OrdemInvertida {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i, cont= 0;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		for(i= 0; i < 5; i++) {
			cont= x[i];
			x[i]= x[10 - i - 1];
			x[10 - i - 1]= cont;
		}
		for(i= 0; i < 10; i++) {
			System.out.println(x[i]);
		}
		t.close();
	}

}
