package IfElse;
/*Fa�a um programa para o usu�rio digitar 4 valores de uma �nica vez e depois fazer
duas somas: soma1 = n1 + n2 e soma2 = n3 + n4, o algoritmo ter� que retornar as duas
somas e se s�o par ou �mpar, se tiverem o mesmo resultado mostre o resultado.*/
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
					" � igual a " + soma1);
		}
		if(soma1 != soma2) {
			if(soma1 % 2 == 0) {
				System.out.println(soma1 + " � par");
			}else {
				System.out.println(soma1 + " � �mpar");
			}
			if(soma2 % 2 == 0) {
				System.out.println(soma2 + " � par");
			}else {
				System.out.println(soma2 + " � �mpar");
			}
		}
		t.close();
	}

}
