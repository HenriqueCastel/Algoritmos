package Vetor;
/*Fa�a um programa que receba o nome de cinco produtos e seus respectivos pre�os, 
calcule e mostre: 
a) a quantidade de produtos com pre�o inferior a R$50,00; 
b) o nome dos produtos com pre�o entre R$35,00 e R$100,00;
c) a m�dia de pre�os dos produtos com pre�o superior a R$100,00;
d) o nome do produto mais caro; 
e) o pre�o e o nome do produto mais barato.*/
import java.util.Scanner;

public class PrecoDe5produtos {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String[] nome= new String[5];
		int[] preco= new int[5];
		int i, cont= 0, cont50= 0, maisCaro= -99999, maisBarato= 99999;
		double soma= 0, media= 0;
		for(i= 0; i < 5; i++) {
			System.out.println("Digite o nome do produto:");
			nome[i]= t.next();
			System.out.println("Digite o pre�o do produto:");
			preco[i]= t.nextInt();
		}
		System.out.println("Produto com pre�o inferior a R$50,00: " + cont50);
		for(i= 0; i < 5; i++) {
			if(preco[i] >= 35 && preco[i] <= 100) {
				System.out.println("Produtos com pre�o entre R$35,00 e R$100,00: " 
			+ nome[i]);
			}
			if(preco[i] > 100) {
				soma= soma + preco[i];
				cont++;
				media= soma / cont;
			}
			if(preco[i] > maisCaro) {
				maisCaro= preco[i];
			}
			if(preco[i] < maisBarato) {
				maisBarato= preco[i];
			}
			if(preco[i] < 50) {
				cont50++;
			}
			t.close();
		}
		System.out.println("M�dia de pre�os dos produtos com pre�o superior a "
				+ "R$100,00: " + media);
		for(i= 0; i > maisCaro; i++) {
			System.out.println("Produto mais caro: " + nome[i]);
		}
		for(i= 0; i < maisBarato; i++) {
			System.out.println("Produto mais barato: " + nome[i] + ", R$: " + preco[i]);
		}
	}

}
