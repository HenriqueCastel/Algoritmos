package Metodos;
/*Faça uma função que receba um número inteiro. Esta função deve verificar se tal 
número é primo. No caso positivo, a função deve retornar 1, caso contrário 0.*/
import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite um número:");
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
