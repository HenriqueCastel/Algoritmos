package IfElse;
/*Fa�a um algoritmo em que o usu�rio digita um valor e retorna se est� nos 
intervalos entre 20 e 30 e entre 50 e 60 ou n�o.*/
import java.util.Scanner;

public class IntervaloDe20a30eDe50a60 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor:");
		valor= t.nextInt();
		if(valor >= 20 && valor <= 30) {
			System.out.println("O valor est� no intervalo entre 20 e 30");
		}else {
			System.out.println("O valor n�o est� no intervalo entre 20 e 30");
		}
		if(valor >= 50 && valor <= 60) {
			System.out.println("O valor est� no intervalo entre 50 e 60");
		}else {
			System.out.println("O valor n�o est� no intervalo entre 50 e 60");
		}
		t.close();
	}

}
