package Vetor;
/*Fa�a um vetor que armazena 7 valores e retorna quantos s�o pares, �mpares e 
negativos.*/
import java.util.Scanner;

public class QuantosSaoParesImparesEnegativos {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[7];
		int i, cont1= 0, cont2= 0, cont3= 0;
		System.out.println("Digite 7 n�meros:");
		for(i= 0; i < 7; i++) {
			x[i]= t.nextInt();
			if(x[i] % 2 == 0) {
				cont1++;
			}
			if(x[i] % 2 != 0) {
				cont2++;
			}
			if(x[i] < 0) {
				cont3++;
			}
		}
		System.out.println(cont1 + " n�meros s�o pares");
		System.out.println(cont2 + " n�meros s�o �mpares");
		System.out.println(cont3 + " n�meros s�o negativos");
		t.close();
	}

}
