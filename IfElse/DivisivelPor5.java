package IfElse;
/*Fa�a um programa que retornar� se o valor digitado pelo usu�rio � divis�vel ou
n�o por 5.*/
import java.util.Scanner;

public class DivisivelPor5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor % 5 == 0) {
			System.out.println("O valor � divis�vel por 5");
		}else {
			System.out.println("O valor n�o � divis�vel por 5");
		}
		t.close();
	}

}
