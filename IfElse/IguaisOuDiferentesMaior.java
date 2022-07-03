package IfElse;
/*Faça um programa que o usuário terá que digitar dois números e retornar se são 
iguais ou diferentes e qual é maior.*/
import java.util.Scanner;

public class IguaisOuDiferentesMaior {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois números:");
		numero1= t.nextInt();
		numero2= t.nextInt();
		if(numero1 == numero2) {
			System.out.println("Os números são iguais");
		}
		if(numero1 != numero2) {
			System.out.println("Os números são diferentes");
		}
		if(numero1 > numero2) {
			System.out.println(numero1 + " é maior");
		}
		if(numero1 < numero2) {
			System.out.println(numero2 + " é maior");
		}
		t.close();
	}

}
