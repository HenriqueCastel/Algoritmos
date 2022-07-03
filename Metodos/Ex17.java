package Metodos;
/*17.O número 3025 possui a característica:
a) 30 + 25 55¯
b) 55 * 55 3025 ¯
Faça um programa que implementa uma função que mostra todos os números de quatro 
algarismos (de 1000 até 9999) que apresentam essa característica.*/
import java.util.Scanner;

public class Ex17 {
	public static void numCarac(int x) {
		String sf= String.valueOf(x);
		String a= sf.substring(0, 2);
		String b= sf.substring(2, 4);
		int w= Integer.parseInt(a);
		int y= Integer.parseInt(b);
		int z= x + y;
		if(z * z== x){
			System.out.println(x);
		}


		
	}
	
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		for(int x= 1000; 9999 >= x; x++){
			x= t.nextInt();
			numCarac(x);
		}
	}

}
