package Arrays;
/*Elabora um algoritmo que entre com uma palvra e se a palavra tiver número ímpar de 
caracteres, imprima conforme o exemplo a seguir: caso contrário, imprima: Não é 
possível mostrar a palavra.
palavra: SONHO
SONHO
ONH
N*/
import java.util.Scanner;

public class PalavraImpar {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String palavra= t.next().toUpperCase();
		int letra= palavra.length();
		if(palavra.length() % 2 == 0) {
			System.out.println("Não é possível mostrar a palavra");
		}else {
			for(int i= 0; i <= letra; i++) {
				System.out.println(palavra.substring(i, letra));
				letra--;
			}
		}
		t.close();
	}

}
