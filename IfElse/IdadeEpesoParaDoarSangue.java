package IfElse;
/*Fa�a um algoritmo em que o usu�rio ter� que digitar sua idade e seu peso e retorna 
se ele pode doar sangue ou n�o, sabendo que voc� s� pode doar se tem entre 18 e 67 
anos e pesa mais que 50kg.*/
import java.util.Scanner;

public class IdadeEpesoParaDoarSangue {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int idade;
		double peso;
		System.out.println("Qual sua idade?");
		idade= t.nextInt();
		if(idade < 18 || idade > 67) {
			System.out.println("Voc� n�o pode doar sangue");
		}else {
			System.out.println("Qual seu peso?");
			peso= t.nextDouble();
			if(peso > 50) {
				System.out.println("Voc� pode doar sangue");
			}else {
				System.out.println("Voc� n�o pode doar sangue");
			}
		}
		t.close();
	}

}
