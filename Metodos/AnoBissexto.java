package Metodos;
/*Fa�a um programa que que tem um m�todo que recebe como par�metro um n�mero inteiro 
que corresponde ao ano e verifique se o ano � bissexto. Um ano � bissexto quando for 
divis�vel por 4 e n�o for divis�vel por 100. Tamb�m consideramos bissextos os 
divis�veis por 400.*/
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
			System.out.println("� bissexto");
		}else {
			System.out.println("N�o � bissexto");
		}
	}

}
