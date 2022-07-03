package Metodos;
/*Função Média: Faça um programa que receba do usuário dois vetores de 10 números cada 
e calcule a média de cada um deles. Para isso, crie uma função Media que receba como 
parâmetro um vetor e que retorne a média de seus valores.*/
import java.util.Scanner;

public class MediaDeDoisVetores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int x[]= new int[10];
		int y[]= new int[10];
		int i;
		double mediax= 0, mediay= 0;
		System.out.println("Digite os valores do vetor x:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		mediax= media(x);
		System.out.println("Média do vetor x: " + mediax);
		System.out.println("Digite os valores do vetor y:");
		for(i= 0; i < 10; i++) {
			y[i]= t.nextInt();
		}
		mediay= media(y);
		System.out.println("Média do vetor y: " + mediay);
		t.close();
	}
	public static double media(int x[]) {
		int i; 
		double soma= 0;
		for(i= 0; i < 10; i++) {
			soma= soma + x[i];
		}
		soma= soma / 10;
		return soma;
	}

}
