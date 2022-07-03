package IfElse;
/*Faça um algoritmo em que o usuário digita um valor e retorna se está no intervalo
entre 20 e 90 ou não.*/
import java.util.Scanner;

public class IntervaloDe20a90 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor >= 20 && valor <= 90) {
			System.out.println("O valor está no intervalo entre 20 e 90");
		}else {
			System.out.println("O valor não está no intervalo entre 20 e 90");
		}
		t.close();
	}

}
