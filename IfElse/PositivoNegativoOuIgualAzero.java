package IfElse;
/*Faça um programa em que o usuário terá que digitarum valor e retorne se ele é
positivo, negativo ou igual a zero.*/
import java.util.Scanner;

public class PositivoNegativoOuIgualAzero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor > 0) {
			System.out.println("O numero é positivo");
		}
		if(valor < 0) {
			System.out.println("O número é negativo");
		}
		if(valor == 0) {
			System.out.println("O número é igual a zero");
		}
		t.close();
	}

}
