package B�sico;
/*Fa�a um programa que retorna o n�mero digitado, seguido de seu sucessor e 
antecessor.*/
import java.util.Scanner;

public class SucessorAntecessor {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero, sucessor, antecessor;
		System.out.println("Digite um n�mero:");
		numero= t.nextInt();
		sucessor= numero + 1;
		antecessor= numero - 1;
		System.out.println("N�mero: " + numero + ", sucessor: " + sucessor + 
				", antecessor: " + antecessor);
		t.close();
	}

}
