package B�sico;
/*Fa�a um algoritmo que pe�a o lado do quadrado e retorna o per�metro e a �rea dele.*/
import java.util.Scanner;

public class PerimetroEareaDoQuadrado {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int lado, perimetro, area;
		System.out.println("Digite um lado do quadrado");
		lado= t.nextInt();
		perimetro= lado * 4;
		area= lado * lado;
		System.out.println("Per�metro do quadrado: " + perimetro + ", �rea: " + area);
		t.close();
	}

}
