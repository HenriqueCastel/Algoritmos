package B�sico;
/*Fa�a um algoritmo que mande o usu�rio digite um n�mero e retorne o n�mero, sua 
metade e seu ter�o.*/
import java.util.Scanner;

public class MetadeTerco {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double numero, metade, terco;
		System.out.println("Digite um n�mero:");
		numero= t.nextDouble();
		metade= numero / 2;
		terco= numero / 3;
		System.out.println("N�mero digitado: " + numero + ", metade: " + metade + 
				", ter�o: " + terco);
		t.close();
	}

}
