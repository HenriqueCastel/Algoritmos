package IfElse;
/*Fa�a um algoritmo que dir� se o n�mero digitado � maior ou menor que 20.*/
import java.util.Scanner;

public class MaiorOuMenorQue20 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero:");
		numero= t.nextInt();
		if(numero > 20) {
			System.out.println("O n�mero � maior que 20");
		}else {
			System.out.println("O n�mero � menor que 20");
		}
		t.close();
	}

}
