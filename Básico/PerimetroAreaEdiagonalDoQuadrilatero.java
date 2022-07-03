package Básico;
/*Faça um algoritmo que calcule o perímetro, a área e a diagonal de um quadrilátero.*/
import java.util.Scanner;

public class PerimetroAreaEdiagonalDoQuadrilatero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double lado1, lado2, perimetro, area, diagonal;
		System.out.println("Digite dois lados diferentes de um quadrilátero:");
		lado1= t.nextDouble();
		lado2= t.nextDouble();
		perimetro= lado1 + lado2 + lado1 + lado2;
		area= lado1 * lado2;
		diagonal= area / 2;
		System.out.println("Perímetro: " + perimetro + ", área: " + area + 
				", diagonal: " + diagonal);
		t.close();
	}

}
