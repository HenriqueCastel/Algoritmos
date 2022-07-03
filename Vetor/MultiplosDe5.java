package Vetor;
/*Lê um vetor e gera um outro vetor a partir dele, só com os múltiplos de 5.*/
import java.util.Scanner;

public class MultiplosDe5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i;
		System.out.println("Digite 10 números:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		System.out.println("Múltiplos de 5:");
		for(i= 0; i < 10; i++) {
			if(x[i] % 5 == 0) {
				System.out.println(x[i]);
			}
		}
		t.close();
	}

}
