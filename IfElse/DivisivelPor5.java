package IfElse;
/*Faça um programa que retornará se o valor digitado pelo usuário é divisível ou
não por 5.*/
import java.util.Scanner;

public class DivisivelPor5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor % 5 == 0) {
			System.out.println("O valor é divisível por 5");
		}else {
			System.out.println("O valor não é divisível por 5");
		}
		t.close();
	}

}
