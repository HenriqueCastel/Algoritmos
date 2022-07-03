package IfElse;
/*Faça um programa em que o usuário terá que digitar dois valores e se o produto 
for menor que 75 irá retornar a soma e os dois valores, se não irá retornar o 
produto e os dois valores.*/
import java.util.Scanner;

public class SomaOuProduto {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, soma, produto;
		System.out.println("Digite dois valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		soma= valor1 + valor2;
		produto= valor1 * valor2;
		if(produto < 75) {
			System.out.println("Soma: " + soma + "; Valores: " + valor1 + " e " + 
		valor2);
		}else {
			System.out.println("Produto: " + produto + "; Valores: " + valor1 + " e " 
		+ valor2);
		}
		t.close();
		
	}

}
