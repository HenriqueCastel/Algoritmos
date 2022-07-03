package IfElse;
/*Faça um programa que o usuário irá digitar três valores de uma única vez e retorne 
qual é o maior e qual é o menor.*/
import java.util.Scanner;

public class MaiorEmenorEntreTresNumeros {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Digite três valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		valor3= t.nextInt();
		if(valor1 > valor2 && valor1 > valor2) {
			System.out.println(valor1 + " é o maior");
		}
		if(valor1 < valor2 && valor1 < valor2) {
			System.out.println(valor1 + " é o menor");
		}
		if(valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2 + " é o maior");
		}
		if(valor2 < valor1 && valor2 < valor3) {
			System.out.println(valor2 + " é o menor");
		}
		if(valor3 > valor1 && valor3 > valor2) {
			System.out.println(valor3 + " é o maior");
		}
		if(valor3 < valor1 && valor3 < valor2) {
			System.out.println(valor3 + " é o menor");
		}
		t.close();
	}

}
