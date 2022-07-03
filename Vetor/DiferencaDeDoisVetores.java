package Vetor;
/*Entrar com números reais para dois vetores A e B de 10 elementos cada. Gerar e 
imprimir o vetor diferença.*/
import java.util.Scanner;

public class DiferencaDeDoisVetores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] A= new int[10];
		int[] B= new int[10];
		int[] diferenca= new int[10];
		int i;
		for(i= 0; i < 10; i++) {
			System.out.println("Digite o valor de A:");
			A[i]= t.nextInt();
			System.out.println("Digite o valor de B:");
			B[i]= t.nextInt();
			diferenca[i]= A[i] - B[i];
		}
		System.out.println("Vetor diferença:");
		for(i= 0; i < 10; i++) {
			System.out.println(diferenca[i]);
		}
		t.close();
	}

}
