package ForDoWhile;
/*Faça um programa que retorna o número que o usuário digitar repetindo ele de acordo 
com o número que foi digitado: 2=22, 7=7777777, 11=1111111111111111111111.*/
import java.util.Scanner;

public class NumeroRepetidoPelasVezesDeleMesmo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int x, i;
		System.out.println("Digite um número:");
		x= t.nextInt();
		for(i= 0; i < x; i++) {
			System.out.print(x);
		}
		t.close();
	}

}
