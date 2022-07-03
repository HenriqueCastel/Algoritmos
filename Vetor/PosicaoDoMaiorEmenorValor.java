package Vetor;
/*Faça um programa que preencha um vetor com 15 elementos, determine e mostre:
a) o maior valor e a posição ocupada por ele no vetor;
b) o menor valor e a posição ocupada por ele no vetor.*/
import java.util.Scanner;

public class PosicaoDoMaiorEmenorValor {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[15];
		int i, maiorValor= -999, menorValor= 999, posicaoMaiorValor= 0, 
				posicaoMenorValor= 0;
		System.out.println("Digite 15 valores:");
		for(i= 0; i < 15; i++) {
			x[i]= t.nextInt();
		}
		for(i= 0; i < 15; i++) {
			if(maiorValor < x[i]) {
				maiorValor= x[i];
				posicaoMaiorValor= i;
			}
			if(menorValor > x[i]) {
				menorValor= x[i];
				posicaoMenorValor= i;
			}
		}
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Posição do maior valor: " + posicaoMaiorValor);
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posição do menor valor: " + posicaoMenorValor);
		t.close();
	}

}
