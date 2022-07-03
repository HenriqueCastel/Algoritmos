package IfElse;
/*Faça um algoritmo em que o usuário digita um valor e retorna se está nos 
intervalos entre 20 e 30 e entre 50 e 60 ou não.*/
import java.util.Scanner;

public class IntervaloDe20a30eDe50a60 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor >= 20 && valor <= 30) {
			System.out.println("O valor está no intervalo entre 20 e 30");
		}else {
			System.out.println("O valor não está no intervalo entre 20 e 30");
		}
		if(valor >= 50 && valor <= 60) {
			System.out.println("O valor está no intervalo entre 50 e 60");
		}else {
			System.out.println("O valor não está no intervalo entre 50 e 60");
		}
		t.close();
	}

}
