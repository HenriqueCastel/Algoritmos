package Vetor;
/*L� um vetor e gera um outro vetor a partir dele, s� com os m�ltiplos de 5.*/
import java.util.Scanner;

public class MultiplosDe5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i;
		System.out.println("Digite 10 n�meros:");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
		System.out.println("M�ltiplos de 5:");
		for(i= 0; i < 10; i++) {
			if(x[i] % 5 == 0) {
				System.out.println(x[i]);
			}
		}
		t.close();
	}

}
