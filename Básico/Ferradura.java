package B�sico;
/*Fa�a um algoritmo que pergunta ao usu�rio quantos cavalos ele tem e retorne quantas 
ferraduras os cavalos ir�o precisar.*/
import java.util.Scanner;

public class Ferradura {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int cavalo, ferradura;
		System.out.println("Quantos cavalos voc� tem?");
		cavalo= t.nextInt();
		ferradura= cavalo * 4;
		System.out.println("Voc� precisar� de " + ferradura + " ferraduras");
		t.close();
	}

}
