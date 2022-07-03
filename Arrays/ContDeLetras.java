package Arrays;

import java.util.Scanner;

public class ContDeLetras {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra= t.next();
		String cont= "";
		int i;
		for(i= 0; i < palavra.length(); i++) {
			System.out.println(cont + palavra.charAt(i));
			cont= cont + palavra.charAt(i);
		}
		t.close();
	}

}
