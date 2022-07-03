package ForDoWhile;
/*Faça um programa que realiza uma pesquisa: primeiro ele pergunta qual o time do 
coração do usuário: a-Caxias, b-Grêmio, c-Inter, d-Juventude, e-Pelotas, f-Xavante,
g-Outro, e em seguida pergunta a cidade: a-Porto Alegre, b-Canoas, c-Esteio, 
d-Sapucaia do Sul, e-São Leopoldo, f-Caxias, g-Pelotas, pergunta qual o salário da 
pessoa e depois se ela quer ou não continuar a pesquisa. Retorna a média dos salários
de torcedores do Grêmio, média dos salários de torcedores do Inter, o total de 
torcedores que moram em Porto Alegre e não torcem pro Grêmio ou pro Inter, total de 
pessoas entrevistadas e o maior salário.*/
import java.util.Scanner;

public class TimeCidadeEsalario {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int tgre= 0, tint= 0, cont= 0, repetir= 0, somapoa= 0;
		double salario, somagre= 0, somaint= 0, mediagre=0, mediaint= 0, 
				maiorSalario= -99999;
		String torcedor, morador;
		do {
			System.out.println("Qual seu time do coraçao: a)Caxias, b)Grêmio, c)Inter,"
					+ " d)Juventude, e)Pelotas, f)Xavante, g)Outro.");
			torcedor= t.next();
			if(torcedor.equalsIgnoreCase("a")) {
			}
			if(torcedor.equalsIgnoreCase("b")) {
				tgre++;
			}
			if(torcedor.equalsIgnoreCase("c")) {
				tint++;
			}
			if(torcedor.equalsIgnoreCase("d")) {
			}
			if(torcedor.equalsIgnoreCase("e")) {
			}
			if(torcedor.equalsIgnoreCase("f")) {
			}
			if(torcedor.equalsIgnoreCase("g")) {
			}
			System.out.println("Qual sua cidade: a)Porto Alegre, b)Canoas, c)Esteio,"
					+ " d)Sapucaia do Sul, e)São Leopoldo, f)Caxias, g)Pelotas.");
			morador= t.next();
			if(morador.equalsIgnoreCase("a")) {
			}
			if(morador.equalsIgnoreCase("b")) {
			}
			if(morador.equalsIgnoreCase("c")) {
			}
			if(morador.equalsIgnoreCase("d")) {
			}
			if(morador.equalsIgnoreCase("e")) {
			}
			if(morador.equalsIgnoreCase("f")) {
			}
			if(morador.equalsIgnoreCase("g")) {
			}
			System.out.println("Qual seu salário?");
			salario= t.nextDouble();
			if(salario > maiorSalario) {
				maiorSalario= salario;
			}
			if(torcedor.equalsIgnoreCase("b")) {
				somagre= somagre + salario;
				mediagre= somagre / tgre;
			}
			if(torcedor.equalsIgnoreCase("c")) {
				somaint= somaint + salario;
				mediaint= somaint / tint;
			}
			System.out.println("Deseja repetir a pesquisa? 1-Sim 2-Não");
			repetir= t.nextInt();
			cont++;
			if(morador.equalsIgnoreCase("a") && !torcedor.equalsIgnoreCase("b") && 
					!torcedor.equalsIgnoreCase("c")) {
				somapoa++;
			}
		}while(repetir != 2);
		System.out.println("Média dos saálrios dos torcedores do Grêmio: " + 
		mediagre);
		System.out.println("Média dos saálrios dos torcedores do Inter: " + mediaint);
		System.out.println("Quantidade de moradores de Porto Alegre que não torcem "
				+ "para o Grêmio ou para o Inter: " + somapoa);
		System.out.println("Total de pessoas entrevistadas: " + cont);
		System.out.println("Maior salário: " + maiorSalario);
		t.close();
	}

}
