package ForDoWhile;
/*Faça um programa que retorna a tabuada do número digitado de 1 a 10.*/
import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int x, i, tabuada;
		System.out.println("Digite um número:");
		x= t.nextInt();
		for(i= 1; i <= 10; i++) {
			tabuada= x * i;
			System.out.println(x + " X " + i + " = " + tabuada);
		}
		t.close();
	}

}
