package Metodos;
/*Faça um programa que que tem um método que recebe como parâmetro um número inteiro 
que corresponde ao ano e verifique se o ano é bissexto. Um ano é bissexto quando for 
divisível por 4 e não for divisível por 100. Também consideramos bissextos os 
divisíveis por 400.*/
import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int ano;
		System.out.println("Digite um ano:");
		ano= t.nextInt();
		anoBissexto(ano);
		t.close();
	}
	public static void anoBissexto(int ano) {
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("É bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
	}

}
