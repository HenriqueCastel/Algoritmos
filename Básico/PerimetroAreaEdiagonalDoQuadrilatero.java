package B�sico;
/*Fa�a um algoritmo que calcule o per�metro, a �rea e a diagonal de um quadril�tero.*/
import java.util.Scanner;

public class PerimetroAreaEdiagonalDoQuadrilatero {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double lado1, lado2, perimetro, area, diagonal;
		System.out.println("Digite dois lados diferentes de um quadril�tero:");
		lado1= t.nextDouble();
		lado2= t.nextDouble();
		perimetro= lado1 + lado2 + lado1 + lado2;
		area= lado1 * lado2;
		diagonal= area / 2;
		System.out.println("Per�metro: " + perimetro + ", �rea: " + area + 
				", diagonal: " + diagonal);
		t.close();
	}

}
