package Vetor;
/*Faça um programa onde o usuário gigita 20 valores que são armazenados em um vetor.
Encontre após o menor valor informado e o mostre bem como o número de vezes que esse 
valor apareceu no vetor.*/
import java.util.Scanner;

public class MenorNumeroEquantasVezesEleAparece {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[20];
		int i, cont= 0, menorvalor= 999;
		System.out.println("Digite vinte valores:");
		for(i= 0; i < 20; i++) {
			x[i]= t.nextInt();
			if(x[i] < menorvalor) {
				menorvalor= x[i];
			}
		}
		for(i= 0; i < 20; i++) {
			if(x[i] == menorvalor) {
				cont++;
			}
		}	
		for(i= 0; i < menorvalor; i++) {
			System.out.println("O menor número é " + x[i]);
			System.out.println("O número aparece " + cont + " vezes");
		}
		t.close();
	}

}
