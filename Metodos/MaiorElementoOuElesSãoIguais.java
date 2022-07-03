package Metodos;
/*Faça um programa que lê 5 pares de valores (considere que serão informados apenas 
valores positivos). Para cada par lido deve ser impresso o valor do maior elemento do 
par ou a frase "Eles são iguais" se os valores do par forem iguais. Para obter o maior 
elemento do par utilize a função MaiorNumero.
a) Maiornumero - a função retorna o maior elemento entre dois valores positivos. Se os
dois valores forem iguais, retorna o valor -1; Entrada de dados: dois valores 
positivos*/
import java.util.Scanner;

public class MaiorElementoOuElesSãoIguais {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int[] x= new int[5];
		int[] y= new int[5];
		int i;
		for(i= 0; i < 5; i++) {
			System.out.println("Digite dois valores:");
			x[i]= t.nextInt();
			y[i]= t.nextInt();
			System.out.println(maiorNumero(x[i], y[i]));
		}
		t.close();
	}
	public static int maiorNumero(int x, int y){
		if(x > y) {
			return x;
		}else {
			if(y > x) {
				return y;
			}else {
				return -1;
			}
		}
		
	}

}
