package IfElse;
/*Fa�a um programa que o usu�rio ir� digitar tr�s valores de uma �nica vez e retorne 
qual � o maior e qual � o menor.*/
import java.util.Scanner;

public class MaiorEmenorEntreTresNumeros {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Digite tr�s valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		valor3= t.nextInt();
		if(valor1 > valor2 && valor1 > valor2) {
			System.out.println(valor1 + " � o maior");
		}
		if(valor1 < valor2 && valor1 < valor2) {
			System.out.println(valor1 + " � o menor");
		}
		if(valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2 + " � o maior");
		}
		if(valor2 < valor1 && valor2 < valor3) {
			System.out.println(valor2 + " � o menor");
		}
		if(valor3 > valor1 && valor3 > valor2) {
			System.out.println(valor3 + " � o maior");
		}
		if(valor3 < valor1 && valor3 < valor2) {
			System.out.println(valor3 + " � o menor");
		}
		t.close();
	}

}
