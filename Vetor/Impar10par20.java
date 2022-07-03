package Vetor;
/*Preencher um vetor B de 10 elementos com 10 se o índice do elemento for ímpar, e 20 
se for par. Escrever o vetor B após o seu total preenchimento.*/
import java.util.Scanner;

public class Impar10par20 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] B= new int[10];
		int i;
		System.out.println("Digite 10 valores:");
		for(i= 0; i < 10; i++) {
			B[i]= t.nextInt();
		}
		for(i= 0; i < 10; i++) {
			if(B[i] % 2 != 0) {
				B[i]= 10;
			}else {
				B[i]= 20;
			}
		}
		for(i= 0; i < 10; i++) {
			System.out.println(B[i]);
		}
		t.close();
	}

}
