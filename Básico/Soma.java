package B�sico;
/*Fa�a um algoritmo que mande o usu�rio digitar dois valores e retorne a soma deles.*/
import java.util.Scanner;

public class Soma {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor1, valor2, soma;
		System.out.println("Digite dois valores:");
		valor1= t.nextInt();
		valor2= t.nextInt();
		soma= valor1 + valor2;
		System.out.println("A soma dos valores � " + soma);
		t.close();
		
		
	}

}
