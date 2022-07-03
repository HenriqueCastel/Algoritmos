package Vetor;
/*Fazer um algoritmo para ler um conjunto de 100 n�meros reais e informar:
a) Quantos n�meros lidos s�o iguais a 30
b) Quantos s�o maiores que a m�dia
c) Quantos s�o iguais � m�dia*/
import java.util.Scanner;

public class IgualA30maiorOuIgualAmedia {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[100];
		int i, cont= 0, contMaiorQue30= 0, contMaiorQueAmedia= 0, contIgualAmedia= 0;
		double soma= 0, media= 0;
		System.out.println("Digite 100 n�meros reais:");
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
		System.out.println(contMaiorQue30 + " n�meros s�o maiores que 30");
		System.out.println(contMaiorQueAmedia + " n�meros s�o maiores que a m�dia");
		System.out.println(contIgualAmedia + " n�meros s�o iguais a m�dia");
		t.close();
	}

}
