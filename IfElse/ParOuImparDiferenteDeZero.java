package IfElse;
/*Fa�a um programa que pede para o usu�rio digitar o valor de a e retornar se ele �
par ou impar e se for diferente de zero.*/
import java.util.Scanner;

public class ParOuImparDiferenteDeZero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int a;
		System.out.println("Digite o valor de a:");
		a= t.nextInt();
		if(a % 2 == 0 && a != 0) {
			System.out.println("O valor de a � par");
			System.out.println("O valor de a � diferente de zero");
		}else {
			System.out.println("O valor de a � �mpar");
			t.close();
		}
	}

}
