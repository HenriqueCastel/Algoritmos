package B�sico;
/*Fa�a uma loja com os seguintes produtos: lata= R$0,35, garrafinha= R$0,60, garrafa= 
R$2,0 e pergunta ao usu�rio quantos de cada ele quer e retorna o total.*/
import java.util.Scanner;

public class Loja {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		double lata, garrafinha, garrafa, total;
		System.out.println("Quantas latas voc� quer?");
		lata= t.nextDouble();
		System.out.println("Quantas garrafinhas voc� quer?");
		garrafinha= t.nextDouble();
		System.out.println("Quantas garrafas voc� quer?");
		garrafa= t.nextDouble();
		total =(lata * 0.35) + (garrafinha * 0.60) + (garrafa * 2);
		System.out.println("Total: R$" + total);
		t.close();
	}

}
