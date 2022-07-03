package Básico;
/*Faça um algoritmo que pergunta quantos pãos e broas ele vai querer e retorne quanto 
ele irá pagar e retorne o valor da poupança, pão= R$0,12, broa= R$1,50 e a poupança é 
um décimo do valor que o usuário irá pagar.*/
import java.util.Scanner;

public class Padaria {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double pao, broa, total, poupanca;
		System.out.println("Quantos pãos você quer?");
		pao= t.nextDouble();
		System.out.println("Quantas broas você quer?");
		broa= t.nextDouble();
		total= (pao * 0.12) + (broa * 1.50);
		poupanca= total / 10;
		System.out.println("Total: R$" + total + ", poupança: R$" + poupanca);
		t.close();
		
	}

}
