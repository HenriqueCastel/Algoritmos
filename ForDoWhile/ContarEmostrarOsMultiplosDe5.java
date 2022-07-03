package ForDoWhile;
/*Faça um programa em que o usuário terá que digitar quantos números ele quiser, o 
programa termina quando ele digita 99 e retorna as seguintes informações: total de 
números digitados, quantos números foram digitados entre 10 e 50, quantos números foram
digitados são ímpares, a soma dos números pares, quantos números são múltiplos de 5, a
média dos números digitados, qual o maior número, qual o menor número e mostrar os 
múltilpos de 5.*/
import java.util.Scanner;

public class ContarEmostrarOsMultiplosDe5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero= 0, cont= 0, cont10e50= 0, contImpar= 0, cont5= 0, 
				maiorNumero= -99999, menorNumero= 99999;
		double media= 0, soma= 0, somaPar= 0;  
		String multiploDe5= " ";
		System.out.println("Digite alguns números, quando tiver terminado digite: "
				+ "99");
		do {
			cont++;
			if(numero != 99) {
				numero= t.nextInt();
				if(numero >= 10 && numero <= 50) {
					cont10e50++;
				}
				if(numero % 2 != 0) {
					contImpar++;
				}
				if(numero % 2 == 0) {
					somaPar= somaPar + numero;
				}
				if(numero % 5 == 0) {
					cont5++;
					multiploDe5 += numero + ", ";
				}
				if(numero > maiorNumero) {
					maiorNumero= numero;
				}
				if(numero < menorNumero) {
					menorNumero= numero;
				}	
			}
		}while(numero != 99);
		soma= soma + numero;
		media= soma / cont;
		System.out.println("Total de números digitados: " + cont);
		System.out.println("Total de números entre 10 e 50: " + cont10e50);
		System.out.println("Total de números ímpares: " + contImpar);
		System.out.println("Soma dos números pares: " + somaPar);
		System.out.println("Total de números múltiplos de 5: " + cont5);
		System.out.println("Média dos números: " + media);
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);
		System.out.println("Múltiplos de 5: " + multiploDe5);
		t.close();
	}

}
