package IfElse;
/*Fa�a um programa que faz o usu�rio digitar dois n�meros e retorna se eles s�o iguais
ou diferentes.*/
import java.util.Scanner;

public class IguaisOuDiferentes {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois n�meros:");
		numero1= t.nextInt();
		numero2= t.nextInt();
		if(numero1 == numero2) {
			System.out.println("Os n�meros s�o iguais");
		}else {
			System.out.println("Os n�meros s�o diferentes");
		}
		t.close();
	}

}
