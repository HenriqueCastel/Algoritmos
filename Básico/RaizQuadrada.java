package Básico;
/*Faça um algoritmo que retorne a raiz quadrada do número que o usuário digitar.*/
import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double numero, raiz;
		System.out.println("Digite um número:");
		numero= t.nextDouble();
		raiz= Math.sqrt(numero);
		System.out.println("A raiz quadrada do número é " + raiz);
		t.close();
	}

}
