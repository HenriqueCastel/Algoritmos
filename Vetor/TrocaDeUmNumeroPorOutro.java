package Vetor;
/*Lê um vetor de reais (apenas valores positivos ou zeros). Apresenta o vetor e após 
substitui os valores iguais a zero por -99. Escreve novamente o vetor.*/
import java.util.Scanner;

public class TrocaDeUmNumeroPorOutro {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[10];
		int i;
		System.out.println("Digite 10 números reais");
		for(i= 0; i < 10; i++) {
			x[i]= t.nextInt();
		}
	    for(i= 0; i < 10; i ++) {
	    	System.out.println(x[i]);
	    	if(x[i] == 0) {
	    		x[i]= -99;
	    		System.out.println(x[i]);
	       	}
	    }
	    t.close();
	}

}
