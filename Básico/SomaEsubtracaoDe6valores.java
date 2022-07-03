package Básico;
/*Faça um algoritmo que mande o usuáro digitar 6 valores e retorne a sua soma e 
subtração.*/
import java.util.Scanner;

public class SomaEsubtracaoDe6valores {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int n1, n2, n3, n4, n5, n6, soma, subtracao;
	    System.out.println("Digite seis valores:");
	    n1= t.nextInt();
	    n2= t.nextInt();
	    n3= t.nextInt();
	    n4= t.nextInt();
	    n5= t.nextInt();
	    n6= t.nextInt();
	    soma= n1 + n2 + n3 + n4 + n5 + n6;
	    subtracao= n1 - n2 - n3 - n4 - n5 - n6;
	    System.out.println("Soma dos valores: " + soma + ", subtração dos valores: "
	    		+ subtracao);
	    t.close();
	}

}
