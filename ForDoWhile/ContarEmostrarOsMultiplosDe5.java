package ForDoWhile;
/*Fa�a um programa em que o usu�rio ter� que digitar quantos n�meros ele quiser, o 
programa termina quando ele digita 99 e retorna as seguintes informa��es: total de 
n�meros digitados, quantos n�meros foram digitados entre 10 e 50, quantos n�meros foram
digitados s�o �mpares, a soma dos n�meros pares, quantos n�meros s�o m�ltiplos de 5, a
m�dia dos n�meros digitados, qual o maior n�mero, qual o menor n�mero e mostrar os 
m�ltilpos de 5.*/
import java.util.Scanner;

public class ContarEmostrarOsMultiplosDe5 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero= 0, cont= 0, cont10e50= 0, contImpar= 0, cont5= 0, 
				maiorNumero= -99999, menorNumero= 99999;
		double media= 0, soma= 0, somaPar= 0;  
		String multiploDe5= " ";
		System.out.println("Digite alguns n�meros, quando tiver terminado digite: "
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
		System.out.println("Total de n�meros digitados: " + cont);
		System.out.println("Total de n�meros entre 10 e 50: " + cont10e50);
		System.out.println("Total de n�meros �mpares: " + contImpar);
		System.out.println("Soma dos n�meros pares: " + somaPar);
		System.out.println("Total de n�meros m�ltiplos de 5: " + cont5);
		System.out.println("M�dia dos n�meros: " + media);
		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("Menor n�mero: " + menorNumero);
		System.out.println("M�ltiplos de 5: " + multiploDe5);
		t.close();
	}

}
