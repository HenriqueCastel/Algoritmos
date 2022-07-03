package Básico;
/*Faça um algoritmo que mande o usuário digite um número e retorne o número, sua 
metade e seu terço.*/
import java.util.Scanner;

public class MetadeTerco {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double numero, metade, terco;
		System.out.println("Digite um número:");
		numero= t.nextDouble();
		metade= numero / 2;
		terco= numero / 3;
		System.out.println("Número digitado: " + numero + ", metade: " + metade + 
				", terço: " + terco);
		t.close();
	}

}
