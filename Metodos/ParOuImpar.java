package Metodos;
/*Faça um programa em que o usuário digita 5 valores e utiliza um metodo que retorna se
é par ou ímpar a cada número.*/
import java.util.Scanner;

public class ParOuImpar {
	
	public static void ePar(int valor) {
		if(valor % 2 == 0){
			System.out.println("É par");
		}else {
			System.out.println("É ímpar");
		}
	}
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int v, i;
		System.out.println("Digite 5 valores:");
		for(i= 0; i < 5; i++) {
			v= t.nextInt();
			ePar(v);
		}
		t.close();
	}

}
