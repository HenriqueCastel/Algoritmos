package Básico;
/*Faça um programa que pergunta a hora e o minuto e retorna quantos minutos tem a 
hora.*/
import java.util.Scanner;

public class HoraMinuto {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int hora, minuto, total;
		System.out.println("Digite respectivamente a hora e o minuto que estamos:");
		hora= t.nextInt();
		minuto= t.nextInt();
		total= (hora * 60) + (minuto * 1);
		System.out.println("Se passaram " + total + " minutos desde o início do dia");
		t.close();
	}

}
