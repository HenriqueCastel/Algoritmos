package Básico;
/*Faça um programa que pergunta qual o salário e qual o valor em vendas o vendedor fez
e retorna o salário com a comissão das vendas, sabendo que a comissão é 
(vendas / 100) * 4.*/
import java.util.Scanner;

public class ComissaoVendas {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double salario, vendas, comissao, salarioComComissao;
		System.out.println("Qual o seu salário?");
		salario= t.nextDouble();
		System.out.println("Qual o valor em vendas você fez esse mês?");
		vendas= t.nextDouble();
		comissao= (vendas / 100) * 4;
		salarioComComissao= salario + comissao;
		System.out.println("Seu salário com comissão é R$" + salarioComComissao);
		t.close();
	}

}
