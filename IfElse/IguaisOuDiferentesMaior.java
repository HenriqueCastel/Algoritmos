package IfElse;
/*Fa�a um programa que o usu�rio ter� que digitar dois n�meros e retornar se s�o 
iguais ou diferentes e qual � maior.*/
import java.util.Scanner;

public class IguaisOuDiferentesMaior {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois n�meros:");
		numero1= t.nextInt();
		numero2= t.nextInt();
		if(numero1 == numero2) {
			System.out.println("Os n�meros s�o iguais");
		}
		if(numero1 != numero2) {
			System.out.println("Os n�meros s�o diferentes");
		}
		if(numero1 > numero2) {
			System.out.println(numero1 + " � maior");
		}
		if(numero1 < numero2) {
			System.out.println(numero2 + " � maior");
		}
		t.close();
	}

}
