package IfElse;
/*Faça um programa que retornará se o valor digitado pelo usuário é divisível ou não 
por 11.*/
import java.util.Scanner;

public class DivisivelPor11 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor % 11 == 0) {
			System.out.println("O valor é divisível por 11");
		}else {
			System.out.println("O valor não é divisível por 11");
		}
		t.close();

	}
	
}
