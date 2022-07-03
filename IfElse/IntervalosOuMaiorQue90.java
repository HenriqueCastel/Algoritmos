package IfElse;
/*Faça um programa em que o usuário terá que digitar um número e ele retorna se 
corresponde ou não os requisitos: estar entre 10 e 20, estar entre 21 e 30 ou ser 
maior que 90.*/
import java.util.Scanner;

public class IntervalosOuMaiorQue90 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero;
		System.out.println("Digite um número:");
		numero= t.nextInt();
		if(numero >= 10 && numero <=20 || numero > 20 && numero <= 30 || numero > 90) {
			System.out.println("O número atendeu a um dos requisitos");
		}else {
			System.out.println("O número não atendeu a nenhum requisito");
		}
		t.close();
	}

}
