package Vetor;
/*Faça um vetor que armazena 7 valores e retorna quantos são pares, ímpares e 
negativos.*/
import java.util.Scanner;

public class QuantosSaoParesImparesEnegativos {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[7];
		int i, cont1= 0, cont2= 0, cont3= 0;
		System.out.println("Digite 7 números:");
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
		System.out.println(cont1 + " números são pares");
		System.out.println(cont2 + " números são ímpares");
		System.out.println(cont3 + " números são negativos");
		t.close();
	}

}
