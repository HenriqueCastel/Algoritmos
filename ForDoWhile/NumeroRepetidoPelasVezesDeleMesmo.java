package ForDoWhile;
/*Fa�a um programa que retorna o n�mero que o usu�rio digitar repetindo ele de acordo 
com o n�mero que foi digitado: 2=22, 7=7777777, 11=1111111111111111111111.*/
import java.util.Scanner;

public class NumeroRepetidoPelasVezesDeleMesmo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int x, i;
		System.out.println("Digite um n�mero:");
		x= t.nextInt();
		for(i= 0; i < x; i++) {
			System.out.print(x);
		}
		t.close();
	}

}
