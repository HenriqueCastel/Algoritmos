package B�sico;
/*Fa�a um algoritmo que retorne a raiz quadrada do n�mero que o usu�rio digitar.*/
import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double numero, raiz;
		System.out.println("Digite um n�mero:");
		numero= t.nextDouble();
		raiz= Math.sqrt(numero);
		System.out.println("A raiz quadrada do n�mero � " + raiz);
		t.close();
	}

}
