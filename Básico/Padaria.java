package B�sico;
/*Fa�a um algoritmo que pergunta quantos p�os e broas ele vai querer e retorne quanto 
ele ir� pagar e retorne o valor da poupan�a, p�o= R$0,12, broa= R$1,50 e a poupan�a � 
um d�cimo do valor que o usu�rio ir� pagar.*/
import java.util.Scanner;

public class Padaria {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double pao, broa, total, poupanca;
		System.out.println("Quantos p�os voc� quer?");
		pao= t.nextDouble();
		System.out.println("Quantas broas voc� quer?");
		broa= t.nextDouble();
		total= (pao * 0.12) + (broa * 1.50);
		poupanca= total / 10;
		System.out.println("Total: R$" + total + ", poupan�a: R$" + poupanca);
		t.close();
		
	}

}
