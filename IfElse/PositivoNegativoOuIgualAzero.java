package IfElse;
/*Fa�a um programa em que o usu�rio ter� que digitarum valor e retorne se ele �
positivo, negativo ou igual a zero.*/
import java.util.Scanner;

public class PositivoNegativoOuIgualAzero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor > 0) {
			System.out.println("O numero � positivo");
		}
		if(valor < 0) {
			System.out.println("O n�mero � negativo");
		}
		if(valor == 0) {
			System.out.println("O n�mero � igual a zero");
		}
		t.close();
	}

}
