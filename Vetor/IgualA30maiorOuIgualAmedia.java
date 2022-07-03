package Vetor;
/*Fazer um algoritmo para ler um conjunto de 100 números reais e informar:
a) Quantos números lidos são iguais a 30
b) Quantos são maiores que a média
c) Quantos são iguais à média*/
import java.util.Scanner;

public class IgualA30maiorOuIgualAmedia {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[100];
		int i, cont= 0, contMaiorQue30= 0, contMaiorQueAmedia= 0, contIgualAmedia= 0;
		double soma= 0, media= 0;
		System.out.println("Digite 100 números reais:");
		for(i= 0; i < 100; i++) {
			x[i]= t.nextInt();
			soma= soma + x[i];
			cont++;
			if(x[i] > 30) {
				contMaiorQue30++;
			}
		}
		for(i= 0; i < 100; i++) {
			media= soma / cont;
			if(x[i] > media) {
				contMaiorQueAmedia++;
			}
			if(x[i] == media) {
				contIgualAmedia++;
			}
		}
		System.out.println(contMaiorQue30 + " números são maiores que 30");
		System.out.println(contMaiorQueAmedia + " números são maiores que a média");
		System.out.println(contIgualAmedia + " números são iguais a média");
		t.close();
	}

}
