package Básico;
/*Faça um algoritmo que peça o lado do quadrado e retorna o perímetro e a área dele.*/
import java.util.Scanner;

public class PerimetroEareaDoQuadrado {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int lado, perimetro, area;
		System.out.println("Digite um lado do quadrado");
		lado= t.nextInt();
		perimetro= lado * 4;
		area= lado * lado;
		System.out.println("Perímetro do quadrado: " + perimetro + ", área: " + area);
		t.close();
	}

}
