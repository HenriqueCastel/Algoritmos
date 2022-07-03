package Arrays;
/*Faça um programa em que o usuário digita uma palavra e retorna somente os caracteres 
na posicao par.*/
import java.util.Scanner;

public class CaracterNaPosicaoPar {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		int i;
		for(i= 0; i < palavra.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(palavra.charAt(i));
			}else {
				System.out.print("");
			}
		}
		t.close();
	}

}
