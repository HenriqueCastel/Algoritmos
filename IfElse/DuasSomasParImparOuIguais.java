package IfElse;
/*Faça um programa para o usuário digitar 4 valores de uma única vez e depois fazer
duas somas: soma1 = n1 + n2 e soma2 = n3 + n4, o algoritmo terá que retornar as duas
somas e se são par ou ímpar, se tiverem o mesmo resultado mostre o resultado.*/
import java.util.Scanner;

public class DuasSomasParImparOuIguais {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int n1, n2, n3, n4, soma1, soma2;
		System.out.println("Digite quatro valores:");
		n1= t.nextInt();
		n2= t.nextInt();
		n3= t.nextInt();
		n4= t.nextInt();
		soma1= n1 + n2;
		soma2= n3 + n4;
		if(soma1 == soma2) {
			System.out.println(n1 + " + " + n2 + " ou " + n3 + " + " + n4 + 
					" é igual a " + soma1);
		}
		if(soma1 != soma2) {
			if(soma1 % 2 == 0) {
				System.out.println(soma1 + " é par");
			}else {
				System.out.println(soma1 + " é ímpar");
			}
			if(soma2 % 2 == 0) {
				System.out.println(soma2 + " é par");
			}else {
				System.out.println(soma2 + " é ímpar");
			}
		}
		t.close();
	}

}
