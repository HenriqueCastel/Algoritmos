package IfElse;
/*Faça um algoritmo em que o usuário terá que digitar sua idade e retorne se ele pode 
doar sangue ou não, sabendo que você só pode doar se tem entre 18 e 67 anos.*/
import java.util.Scanner; 

public class IdadeParaDoarSangue {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int idade;
		System.out.println("Qual sua idade?");
		idade= t.nextInt();
		if(idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue");
		}else {
			System.out.println("Você não pode doar sangue");
		}
		t.close();
	}

}
