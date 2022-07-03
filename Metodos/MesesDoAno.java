package Metodos;
/*Faça um um procedimento que receba um número inteiro e imprima o mês correspondente 
ao número. Por exemplo, 2 corresponde à fevereiro. O procedimento deve mostrar uma 
mensagem de erro caso o número recebido não faça sentido. Gere também um programa que 
leia um valor e chame o procedimento criado.*/
import java.util.Scanner;

public class MesesDoAno {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero:");
		numero= t.nextInt();
		mes(numero);
		t.close();
	}
	public static void mes(int numero) {
		if(numero == 1) {
			System.out.println("Janeiro");
		}
		if(numero == 2) {
			System.out.println("Fevereiro");
		}
		if(numero == 3) {
			System.out.println("Março");
		}
		if(numero == 4) {
			System.out.println("Abril");
		}
		if(numero == 5) {
			System.out.println("Maio");
		}
		if(numero == 6) {
			System.out.println("Junho");
		}
		if(numero == 7) {
			System.out.println("Julho");
		}
		if(numero == 8) {
			System.out.println("Agosto");
		}
		if(numero == 9) {
			System.out.println("Setembro");
		}
		if(numero == 10) {
			System.out.println("Outubro");
		}
		if(numero == 11) {
			System.out.println("Novembro");
		}
		if(numero == 12) {
			System.out.println("Dezembro");
		}
		if(numero > 12 || numero < 1) {
			System.out.println("Erro");
		}
	}

}
