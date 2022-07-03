package Básico;
/*Faça uma loja com os seguintes produtos: lata= R$0,35, garrafinha= R$0,60, garrafa= 
R$2,0 e pergunta ao usuário quantos de cada ele quer e retorna o total.*/
import java.util.Scanner;

public class Loja {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double lata, garrafinha, garrafa, total;
		System.out.println("Quantas latas você quer?");
		lata= t.nextDouble();
		System.out.println("Quantas garrafinhas você quer?");
		garrafinha= t.nextDouble();
		System.out.println("Quantas garrafas você quer?");
		garrafa= t.nextDouble();
		total =(lata * 0.35) + (garrafinha * 0.60) + (garrafa * 2);
		System.out.println("Total: R$" + total);
		t.close();
	}

}
