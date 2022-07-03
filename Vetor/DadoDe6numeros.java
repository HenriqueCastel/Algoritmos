package Vetor;
/*Faça um programa que receba o número sorteado por um dado em vinte jogadas, 
mostre os números sorteados e a frequência com que apareceram.*/
import java.util.Random;

public class DadoDe6numeros {
	public static void main(String[]args) {
		int[] x= new int[20];
		int i, cont0= 0, cont1= 0, cont2= 0, cont3= 0, cont4= 0, cont5= 0;
		Random gerador= new Random();
		for(i= 0; i < 20; i++) {
			x[i]= gerador.nextInt(6);
			if(x[i] == 0) {
				cont0++;
			}
			if(x[i] == 1) {
				cont1++;
			}
			if(x[i] == 2) {
				cont2++;
			}
			if(x[i] == 3) {
				cont3++;
			}
			if(x[i] == 4) {
				cont4++;
			}
			if(x[i] == 5) {
				cont5++;
			}
		}
		for(i= 0; i < 20; i++) {
			System.out.println(x[i]);
		}
		System.out.println("O dado caiu " + cont0 + " vezes no 0");
		System.out.println("O dado caiu " + cont1 + " vezes no 1");
		System.out.println("O dado caiu " + cont2 + " vezes no 2");
		System.out.println("O dado caiu " + cont3 + " vezes no 3");
		System.out.println("O dado caiu " + cont4 + " vezes no 4");
		System.out.println("O dado caiu " + cont5 + " vezes no 5");
	}

}
