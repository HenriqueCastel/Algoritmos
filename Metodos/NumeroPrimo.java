package Metodos;
/*Fa�a uma fun��o que receba um n�mero inteiro. Esta fun��o deve verificar se tal 
n�mero � primo. No caso positivo, a fun��o deve retornar 1, caso contr�rio 0.*/
import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero= t.nextInt();
		primo(numero);
		t.close();
	}
	public static void primo(int numero) {
		if(numero % 2 != 0 && numero % 3 != 0 || numero == 3) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
