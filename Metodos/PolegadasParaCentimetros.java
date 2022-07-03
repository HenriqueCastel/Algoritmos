package Metodos;
/*Faça uma função que realize a conversão de Polegadas (pol) para Centímetros (cm), 
onde pol é passado como parâmetro e cm é retornado. Sabe-se que 1 polegada é 2,54 
centímetros.*/
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
		System.out.println("Valor em centímetros: " + polegada);
	}

}
