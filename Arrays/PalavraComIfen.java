package Arrays;
/*Faça um programa que lê uma palavra e mostra ela separada por -. Por exemplo,
palavra: "banana", será mostrado na tela: b-a-n-a-n-a.*/
import java.util.Scanner;

public class PalavraComIfen {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		int i;
		for(i= 0; i < palavra.length(); i++) {
			if(palavra.length() - 1 == i) {
				System.out.println(palavra.charAt(i));
			}else {
				System.out.print(palavra.charAt(i) + "-");
			}
		}
		t.close();
	}

}
