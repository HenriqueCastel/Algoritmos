package IfElse;
/*Fa�a um programa em que o usu�rio ter� que digitar 3 valores e retorna a soma e se
a soma � par ou n�o.*/
import java.util.Scanner;

public class SomaPar {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, valor3, soma;
		System.out.println("Digite tr�s valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		valor3= t.nextInt();
		soma= valor1 + valor2 + valor3;
		if(soma % 2 == 0) {
			System.out.println("A soma � par");
		}else {
			System.out.println("A soma n�o � par");
		}
		t.close();
	}

}
