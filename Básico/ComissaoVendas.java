package B�sico;
/*Fa�a um programa que pergunta qual o sal�rio e qual o valor em vendas o vendedor fez
e retorna o sal�rio com a comiss�o das vendas, sabendo que a comiss�o � 
(vendas / 100) * 4.*/
import java.util.Scanner;

public class ComissaoVendas {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double salario, vendas, comissao, salarioComComissao;
		System.out.println("Qual o seu sal�rio?");
		salario= t.nextDouble();
		System.out.println("Qual o valor em vendas voc� fez esse m�s?");
		vendas= t.nextDouble();
		comissao= (vendas / 100) * 4;
		salarioComComissao= salario + comissao;
		System.out.println("Seu sal�rio com comiss�o � R$" + salarioComComissao);
		t.close();
	}

}
