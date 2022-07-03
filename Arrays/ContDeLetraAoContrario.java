package Arrays;
/*Conforme o exercício anterior, mas a palavra deve ser impressa conforme o exemplo:
palavra: TERRA
A
RA
RRA
ERRA
TERRA.*/
import java.util.Scanner;

public class ContDeLetraAoContrario {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		String cont= "";
		int i;
		for(i= palavra.length() - 1; i >= 0; i--) {
			System.out.println(cont + palavra.charAt(i));
			cont= cont + palavra.charAt(i);
		}
		t.close();
	}

}
