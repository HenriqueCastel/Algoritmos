package Vetor;
/*Suponha tr�s vetores de 30 elementos cada, conte�do: nome, telefone e endere�o. Leia
essas informa��es e salve nos respectivos vetores. Fa�a um algoritmo que possa buscar 
o cadastro pelo nome e imprimir todos os campos desse nome(nome, endere�o, 
telefone).*/
import java.util.Scanner;

public class NomeEnderecoEtelefone {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String[] nome= new String[30];
		String[] endereco= new String[30];
		long[] telefone= new long[30];
		int i;
		for(i= 0; i < 30; i++) {
			System.out.println("Digite um nome:");
			nome[i]= t.next();
			System.out.println("Digite um endere�o:");
			endereco[i]= t.next();
			System.out.println("Digite um n�mero:");
			telefone[i]= t.nextLong();
		}
		System.out.println("Escreva um dos nomes digitados:");
		String busca= t.next();
		for(i= 0; i < 30; i++) {
			if(busca.equalsIgnoreCase(nome[i])) {
				System.out.println("Endere�o: " + endereco[i] + ", telefone: " +
		telefone[i]);
			}
			t.close();
		}
	}

}
