package Metodos;
/*Arredondamento: Escreva um programa que arredonde números fornecidos pelo usuário.
Para isso, crie uma função Arredondar que receba como parâmetro de entrada um número 
real e retorne como saída um número inteiro. O arredondamento deve ser feito de forma 
que se a parte decimal da entrada for maior ou igual a 0.5, então o número deve ser 
arredondado para o próximo inteiro; caso contrário, para o inteiro anterior. O programa
deve se encerrar quando o usuário digitar o valor 0 (zero). Exemplo:
1 Digite um valor real a ser arredondado:
2 20.403
3 O valor foi arredondado para 20.
4
5 Digite um valor real a ser arredondado:
6 10.5
7 O valor foi arredondado para 11.
8
9 Digite um valor real a ser arredondado:
10 70.7
11 O valor foi arredondado para 71.
12
13 Digite um valor real a ser arredondado:
14 0
15 Fim do programa.*/
import java.util.Scanner;

public class ArredondamentoDeValores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double valor;
		do {
			System.out.println("Digite um valor:");
			valor= t.nextDouble();
		}while(valor != 0);
		arredondamento(valor);
		t.close();
	}
	public static void arredondamento(double valor) {
		int valorArredondado;
		valorArredondado= (int) valor;
		if(valor - valorArredondado >= 0.5) {
			System.out.println("Valor arredondado: " + (valorArredondado + 1));
		}else {
			System.out.println("Valor arredondado: " + valorArredondado);
		}
	}

}
