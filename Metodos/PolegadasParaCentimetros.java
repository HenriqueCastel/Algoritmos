package Metodos;
/*Fa�a uma fun��o que realize a convers�o de Polegadas (pol) para Cent�metros (cm), 
onde pol � passado como par�metro e cm � retornado. Sabe-se que 1 polegada � 2,54 
cent�metros.*/
import java.util.Scanner;

public class PolegadasParaCentimetros {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double polegada;
		System.out.println("Digite um valor em polegadas:");
		polegada= t.nextDouble();
		centimetro(polegada);
		t.close();
	}
	public static void centimetro(double polegada) {
		polegada= polegada * 2.54;
		System.out.println("Valor em cent�metros: " + polegada);
	}

}
