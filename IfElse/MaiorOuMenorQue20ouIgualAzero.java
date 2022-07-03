package IfElse;
/*Faça um algoritmo que dirá se o número digitado é maior ou menor que 20 e se for 
igual a zero.*/
import java.util.Scanner;

public class MaiorOuMenorQue20ouIgualAzero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero:");
		numero= t.nextInt();
		if(numero > 20) {
			System.out.println("O número é maior que 20");
		}else {
			System.out.println("O número é menor que 20");
		}
		if(numero == 0) {
			System.out.println("O número é igual a zero");
		}
		t.close();
	}

}
