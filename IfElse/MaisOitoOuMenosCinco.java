package IfElse;
/*Fa�a um programa em que o usu�rio ter� que digitar dois valores e se a soma for 
maior que 20 ir� retornar o valor + 8, se n�o ir� retornar o valor -5.*/
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
