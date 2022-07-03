package Básico;
/*Faça um programa que pergunta ao usuário qual o salário dele e duas contas mensais 
que ele tem que pagar e mais uma multa que é calculada da seguinte forma:
((conta1 + conta2) / 100) * 2, e retorna o que sobrará do salário.*/
import java.util.Scanner;

public class RestanteDoSalario {
	public static void main(String[]args) {	
		Scanner t= new Scanner(System.in);
		double salario, conta1, conta2, multa, restante;
		System.out.println("Digite seu salário:");
		salario= t.nextDouble();
		System.out.println("Digite o valor de duas contas mensais que você tem que "
				+ "pagar:");
		conta1= t.nextDouble();
		conta2= t.nextDouble();
		multa= ((conta1 + conta2) / 100) * 2;
		restante= salario - (conta1 + conta2 + multa);
		System.out.println("Sobrou R$" + restante + " do salário");
		t.close();
	}

}
