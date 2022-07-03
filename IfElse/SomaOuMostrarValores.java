package IfElse;
/*Faça um programa que o usuário digita dois valores, se a soma dele for maior que 10 
vai retornar o resultado da soma, se não apenas mostra os dois valores.*/
import java.util.Scanner;

public class SomaOuMostrarValores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
        int valor1, valor2, soma;
        System.out.println("Digite dois valores:");
        valor1= t.nextInt();
        valor2= t.nextInt();
        soma= valor1 + valor2;
        if(soma > 10) {
        	System.out.println("Soma: " + soma);
        }else {
        	System.out.println("Números digitados: " + valor1 + ", " + valor2);
        }
        t.close();
	}

}
