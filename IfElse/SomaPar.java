package IfElse;
/*Faça um programa em que o usuário terá que digitar 3 valores e retorna a soma e se
a soma é par ou não.*/
import java.util.Scanner;

public class SomaPar {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, valor3, soma;
		System.out.println("Digite três valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		valor3= t.nextInt();
		soma= valor1 + valor2 + valor3;
		if(soma % 2 == 0) {
			System.out.println("A soma é par");
		}else {
			System.out.println("A soma não é par");
		}
		t.close();
	}

}
