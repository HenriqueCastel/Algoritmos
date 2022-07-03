package Básico;
/*Faça um programa que pede um valor e retorna com um juro de 15%.*/
import java.util.Scanner;

public class Juros {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double valor, juro;
		System.out.println("Digite um valor:");
		valor= t.nextDouble();
		juro= valor * 1.15;
		System.out.println("O valor com o juro é " + juro);
		t.close();
		
	}

}
