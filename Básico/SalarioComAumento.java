package Básico;
/*Faça um programa que pergunta o salário e retorna ele com o aumento de 15%.*/
import java.util.Scanner;

public class SalarioComAumento {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double salario, aumento;
		System.out.println("Qual seu salário?");
		salario= t.nextDouble();
		aumento= salario * 1.15;
		System.out.println("Você ganhou um aumento! Seu salário agora é R$" + aumento);
		t.close();
	}

}
