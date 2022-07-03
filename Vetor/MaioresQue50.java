package Vetor;
/*Faça um programa que lê 10 valores e armazena em um vetor, mostra os valores que são 
maiores que 50.*/
import java.util.Scanner;

public class MaioresQue50 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
			}
		for(i= 0; i < 10; i++) {
			if(x[i] > 50) {
				System.out.println(x[i]);
			}
		}
		t.close();
	}

}
