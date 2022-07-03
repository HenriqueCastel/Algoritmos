package Básico;
/*Faça um algoritmo que pergunta ao usuário quantos cavalos ele tem e retorne quantas 
ferraduras os cavalos irão precisar.*/
import java.util.Scanner;

public class Ferradura {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int cavalo, ferradura;
		System.out.println("Quantos cavalos você tem?");
		cavalo= t.nextInt();
		ferradura= cavalo * 4;
		System.out.println("Você precisará de " + ferradura + " ferraduras");
		t.close();
	}

}
