package Metodos;
/*Faça um procedimento que receba um número natural e imprima os três primeiros 
caracteres do dia da semana correspondente ao número. Por exemplo, 7 corresponde à SAB.
O procedimento deve mostrar uma mensagem de erro caso o número recebido não corresponda
à um dia da semana. Gere também um programa que utilize esse procedimento, chamando-o, 
mas antes lendo um valor para passagem de parâmetro.*/
import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int dia;
		System.out.println("Digite o dia da semana:");
		dia= t.nextInt();
		diaDaSemana(dia);
		t.close();
	}
	public static void diaDaSemana(int dia) {
		if(dia == 1) {
			System.out.println("DOM");
		}
		if(dia == 2) {
			System.out.println("SEG");
		}
		if(dia == 3) {
			System.out.println("TER");
		}
		if(dia == 4) {
			System.out.println("QUA");
		}
		if(dia == 5) {
			System.out.println("QUI");
		}
		if(dia == 6) {
			System.out.println("SEX");
		}
		if(dia == 7) {
			System.out.println("SAB");
		}
		if(dia > 7 || dia < 1) {
			System.out.println("Erro");
		}
	}

}
