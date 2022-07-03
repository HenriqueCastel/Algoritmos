package ForDoWhile;
/*Faça um programa que o usuário terá que digitar uns números e retornar: o maior, o 
menor, a soma dos pares, a média dos ímpares, quantos números são maiores que 50 e a
porcentagem dos maiores que 20. O programa termina quando o usuário digitar 0.*/
import java.util.Scanner;

public class PorcentagemMaioresQue20 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero, cont= 0, maiorNumero= -99999, menorNumero= 99999, somaPar= 0, 
				somaImpar= 0, contImpar= 0, cont50= 0, cont20= 0;
		double mediaImpar, porcentagemMaiorQue20= 0;
		System.out.println("Digite alguns números, quando tiver terminado digite 0");
		do {
			numero= t.nextInt();
			if(numero != 0) {
				cont++;
				if(numero > maiorNumero) {
					maiorNumero= numero;
				}
				if(numero < menorNumero) {
					menorNumero= numero;
				}
				if(numero % 2 == 0) {
					somaPar= somaPar + numero;
				}
				if(numero % 2 != 0) {
					somaImpar= somaImpar + numero;
					contImpar++;
				}
				if(numero > 50) {
					cont50++;
				}
				if(numero > 20) {
					cont20++;
				}
			}
		}while(numero != 0);
		mediaImpar= somaImpar / contImpar;
		porcentagemMaiorQue20= (cont20 * 100) / cont;
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);
		System.out.println("Soma dos números pares: " + somaPar);
		System.out.println("Média dos números ímpares: " + mediaImpar);
		System.out.println("Total de números são maiores que 50: " + cont50);
		System.out.println("Percentual maior que 20: " + porcentagemMaiorQue20 + "%");
		t.close();
	}

}
