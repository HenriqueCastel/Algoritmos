package Metodos;
/*Fa�a um programa em que o usu�rio digita 5 valores e utiliza um metodo que retorna se
� par ou �mpar a cada n�mero.*/
import java.util.Scanner;

public class ParOuImpar {
	
	public static void ePar(int valor) {
		if(valor % 2 == 0){
			System.out.println("� par");
		}else {
			System.out.println("� �mpar");
		}
	}
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int v, i;
		System.out.println("Digite 5 valores:");
		for(i= 0; i < 5; i++) {
			v= t.nextInt();
			ePar(v);
		}
		t.close();
	}

}
