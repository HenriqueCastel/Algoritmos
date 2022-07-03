package IfElse;
/*Faça um programa em que o usuário terá que digitar o valor de x e retorne se é 
positivo ou negativo.*/
import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int x;
		System.out.println("Digite o valor de x:");
		x= t.nextInt();
		if(x >= 0) {
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		t.close();
	}

}
