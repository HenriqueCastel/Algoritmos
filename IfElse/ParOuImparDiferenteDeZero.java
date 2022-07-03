package IfElse;
/*Faça um programa que pede para o usuário digitar o valor de a e retornar se ele é
par ou impar e se for diferente de zero.*/
import java.util.Scanner;

public class ParOuImparDiferenteDeZero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int a;
		System.out.println("Digite o valor de a:");
		a= t.nextInt();
		if(a % 2 == 0 && a != 0) {
			System.out.println("O valor de a é par");
			System.out.println("O valor de a é diferente de zero");
		}else {
			System.out.println("O valor de a é ímpar");
			t.close();
		}
	}

}
