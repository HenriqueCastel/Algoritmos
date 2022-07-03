package Arrays;
/*Elabore um algoritmo que lê uma mensagem e criptografa da seguinte maneira: 
a) A - X 
b) E - Y 
c) I - W 
d) O - K 
e) U - Z.*/
import java.util.Scanner;

public class TrocaDeLetras {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		String troca= palavra.replace('a', 'x').replace('e', 'y').replace('i', 'w')
				.replace('o', 'k').replace('u', 'z');
		System.out.println(troca);
		t.close();
	}

}
