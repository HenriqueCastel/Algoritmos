package IfElse;
/*Faça um programa que faz o usuário digitar dois números e retorna se eles são iguais
ou diferentes.*/
import java.util.Scanner;

public class IguaisOuDiferentes {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois números:");
		numero1= t.nextInt();
		numero2= t.nextInt();
		if(numero1 == numero2) {
			System.out.println("Os números são iguais");
		}else {
			System.out.println("Os números são diferentes");
		}
		t.close();
	}

}
