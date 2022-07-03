package Básico;
/*Faça um programa que calcula as despesas mais a gorjeta, sabendo que a gorjeta é 10%
das despesas.*/
import java.util.Scanner;

public class Gorjeta {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double despesa, gorjeta, total;
		System.out.println("Digite quais foram suas despesas:");
		despesa= t.nextDouble();
		gorjeta= despesa / 10;
		total= despesa + gorjeta;
		System.out.println("Suas despesas totais com a grojeta é de R$" + total);
		t.close();
	}

}
