package ForDoWhile;
/*Fa�a um programa que o usu�rio ter� que digitar uns n�meros e retornar: o maior, o 
menor, a soma dos pares, a m�dia dos �mpares, quantos n�meros s�o maiores que 50 e a
porcentagem dos maiores que 20. O programa termina quando o usu�rio digitar 0.*/
import java.util.Scanner;

public class PorcentagemMaioresQue20 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero, cont= 0, maiorNumero= -99999, menorNumero= 99999, somaPar= 0, 
				somaImpar= 0, contImpar= 0, cont50= 0, cont20= 0;
		double mediaImpar, porcentagemMaiorQue20= 0;
		System.out.println("Digite alguns n�meros, quando tiver terminado digite 0");
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
		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("Menor n�mero: " + menorNumero);
		System.out.println("Soma dos n�meros pares: " + somaPar);
		System.out.println("M�dia dos n�meros �mpares: " + mediaImpar);
		System.out.println("Total de n�meros s�o maiores que 50: " + cont50);
		System.out.println("Percentual maior que 20: " + porcentagemMaiorQue20 + "%");
		t.close();
	}

}
