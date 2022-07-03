package Metodos;
/*Fun��o M�dia: Fa�a um programa que receba do usu�rio dois vetores de 10 n�meros cada 
e calcule a m�dia de cada um deles. Para isso, crie uma fun��o Media que receba como 
par�metro um vetor e que retorne a m�dia de seus valores.*/
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
		System.out.println("M�dia do vetor x: " + mediax);
		System.out.println("Digite os valores do vetor y:");
		for(i= 0; i < 10; i++) {
			y[i]= t.nextInt();
		}
		mediay= media(y);
		System.out.println("M�dia do vetor y: " + mediay);
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
