package B�sico;
/*Fa�a um programa que pergunta o sal�rio e retorna ele com o aumento de 15%.*/
import java.util.Scanner;

public class SalarioComAumento {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double salario, aumento;
		System.out.println("Qual seu sal�rio?");
		salario= t.nextDouble();
		aumento= salario * 1.15;
		System.out.println("Voc� ganhou um aumento! Seu sal�rio agora � R$" + aumento);
		t.close();
	}

}
