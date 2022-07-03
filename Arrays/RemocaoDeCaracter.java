package Arrays;
/*Faça um programa para ler uma palavra e um caracter qualquer. Retirar todas as 
ocorrências desse caracter na palavra. Exemplo: palavra: "arvore* e o caracter 'r', 
então o resultado será "avoe".*/
import java.util.Scanner;

public class RemocaoDeCaracter {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		System.out.println("Digite um caracter que você deseja remover:");
		String caracter= t.next();
		String palavraNova= palavra.replace(caracter, "");
		System.out.println(palavraNova);
		t.close();
	}

}
