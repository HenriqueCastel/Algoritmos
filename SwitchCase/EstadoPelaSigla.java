package SwitchCase;
/*Fa�a um programa que pergunta ao usu�rio qual a sigla do estado de dele, se for rs: 
GA�CHO, rj: CARIOCA, sp: PAULISTA, mg: MINEIRO, outro: outro estado.*/
import java.util.Scanner;

public class EstadoPelaSigla {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite a sigla do seu estado:");
		String sigla= t.next();
		switch(sigla) {
		case "rs":
			System.out.println("GA�CHO");
			break;
		case "rj":
			System.out.println("CARIOCA");
			break;
		case "sp":
			System.out.println("PAULISTA");
			break;
		case "mg":
			System.out.println("MINEIRO");
			break;
		    default:
		    	System.out.println("Outro estado");
		}
		t.close();
	}

}
