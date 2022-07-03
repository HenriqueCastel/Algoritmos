package ForDoWhile;
/*Faça um programa que pergunta quantas vezes a pessoa usou o xerox e se ela quer ou 
não repetir a pesquisa, se ela terminar a pesquisa retorne: quantas vezes foram usadas 
o xerox, o percentual de alunos que utilizaram o xerox menos de 5 vezes, o percentual 
de alunos que utilizaram o xerox entre 5 e 10 vezes, o percentual de alunos que 
utilizaram mais de 10 vezes, a média de utilização, a maior e menor quantidade 
utilizada.*/
import java.util.Scanner;

public class Xerox {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int quantidade, repetir, cont= 0, contMenosDe5= 0, contMaisDe5= 0, 
				contMaisDe10= 0, soma= 0, maiorQuantidade= -99999, 
				menorQuantidade= 99999;
		double percMenosDe5= 0, percMaisDe5= 0, percMaisDe10= 0, media= 0;
		do {
			System.out.println("Quantas vezes você quer usar o xerox?");
			quantidade= t.nextInt();
			cont++;
			soma= soma + quantidade;
			System.out.println("Deseja repetir? 1-Sim 2-Não");
			repetir= t.nextInt();
			if(quantidade < 5) {
				contMenosDe5++;
			}
			if(quantidade >= 5 && quantidade <= 10) {
				contMaisDe5++;
			}
			if(quantidade > 10) {
				contMaisDe10++;
			}
			if(quantidade > maiorQuantidade) {
				maiorQuantidade= quantidade;
			}
			if(quantidade < menorQuantidade) {
				menorQuantidade= quantidade;
			}
		}while(repetir != 2);
		media= soma / cont;
		percMenosDe5= (contMenosDe5 * 100) / cont;
		percMaisDe5= (contMaisDe5 * 100) / cont;
		percMaisDe10= (contMaisDe10 * 100) / cont;
		System.out.println("Vezes o xerox foi utilizado: " + cont);
		System.out.println("Vezes utilizado menos de 5 vezes: " + percMenosDe5 + "%");
		System.out.println("Vezes utilizado mais de 5 vezes: " + percMaisDe5 + "%");
		System.out.println("Vezes utilizado mais de 10 vezes: " + percMaisDe10 + "%");
		System.out.println("Média de utilização: " + media);
		System.out.println("Maior quantidade de utilização: " + maiorQuantidade);
		System.out.println("Menor quantidade de utilização: " + menorQuantidade);
		t.close();
	}

}
