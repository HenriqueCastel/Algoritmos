package Metodos;
/*Fa�a um programa que tem um m�todo que recebe como par�metro um n�mero e mostra a
tabuada deste n�mero.*/
import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um n�mero:");
		numero= t.nextInt();
		tabuada(numero);
		t.close();
	}
	public static void tabuada(int numero) {
		int i;
		for(i= 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
