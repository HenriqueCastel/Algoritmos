package Vetor;
/*Faça um programa que leia valores inteiros correspondentes a 100 amostras utilizadas
em uma pesquisa, armazene-os em um vetor e o escreva. Substitua a seguir todos os 
valores negativos desse vetor por 999 e escreva o vetor modiﬁcado.*/
import java.util.Scanner;

public class ValorNegativoPor99 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		for(i= 0; i < 10; i++) {
			if(x[i] < 0) {
				x[i]= 99;
			}
		}
		for(i= 0; i < 10; i++) {
			System.out.println(x[i]);
		}
		t.close();
	}

}
