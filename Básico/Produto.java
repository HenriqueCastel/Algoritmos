package B�sico;
/*Fa�a um programa que l� dois valores e retorna seu produto.*/
import java.util.Scanner;

public class Produto {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, produto;
		System.out.println("Digite dois valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		produto= valor1 * valor2;
		System.out.println("O produto dos valores � " + produto);
		t.close();
				
	}

}
