package Vetor;
/*89.Criar um algoritmo que possa armazenar nome, duas notas e m�dia de 50 alunos. 
A m�dia ser� calculada segundo o crit�rio: peso 3 para a primeira nota e peso 7 para 
a segunda nota. A impress�o dever� conter nome, duas notas e a m�dia.
Tela do sistema:
1. Entrar com nomes
2. Entrar com 1a.nota
3. Entrar com 2a.nota
4. Calcular m�dia das notas
5. Listar todas as informa��es na tela
6. Sair (digite 0)*/
import java.util.Scanner;

public class MediaDasProvasDe50alunos {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String[] nome= new String[50];
		double[] nota1= new double[50];
		double[] nota2= new double[50];
		double[] media= new double[50];
		int i;
		for(i= 0; i < 50; i++) {
			System.out.println("Digite o nome de um aluno:");
			nome[i]= t.next();
			System.out.println("Digite sua primeira nota:");
			nota1[i]= t.nextDouble();
			System.out.println("Digite sua segunda nota:");
			nota2[i]= t.nextDouble();
			media[i]= (nota1[i] * 0.3) + (nota2[i] * 0.7);
		}
		for(i= 0; i < 50; i++) {
			System.out.println("Nome: " + nome[i]);
			System.out.println("Primeira nota: " + nota1[i]);
			System.out.println("Segunda nota: " + nota2[i]);
			System.out.println("M�dia: " + media[i]);
		}
		t.close();
	}

}
