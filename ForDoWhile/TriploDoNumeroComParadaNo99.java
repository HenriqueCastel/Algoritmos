package ForDoWhile;
/*Faça um programa que retorna o triplo do número que o usuário digitar, se ele 
digitar -999, o programa para.*/
import java.util.Scanner;

public class TriploDoNumeroComParadaNo99 {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int numero, triplo;
		System.out.println("Digite um número, para encerrar o programa, digite -999");
		do {
			numero= t.nextInt();
			triplo= numero * 3;
			System.out.println(triplo);
		}while(numero != -999);
		t.close();
	}

}
