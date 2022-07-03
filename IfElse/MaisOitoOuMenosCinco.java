package IfElse;
/*Faça um programa em que o usuário terá que digitar dois valores e se a soma for 
maior que 20 irá retornar o valor + 8, se não irá retornar o valor -5.*/
import java.util.Scanner;

public class MaisOitoOuMenosCinco {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, soma;
		System.out.println("Digite dois valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		soma= valor1 + valor2;
		if(soma > 20) {
			System.out.println(soma + 8);
		}else {
			System.out.println(soma + (-5));
		}
		t.close();
	}
}
