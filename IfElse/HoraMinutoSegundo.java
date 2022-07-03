package IfElse;
/*Faça um programa em que o usuário terá que digitar: hora, minuto e segundo e depois 
retornar quantos segundos se passaram no dia.*/
import java.util.Scanner;

public class HoraMinutoSegundo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		int hora, minuto, segundo, total;
		System.out.println("Digite respectivamente hora, minuto e segundo atuais:");
		hora= t.nextInt();
		minuto= t.nextInt();
		segundo= t.nextInt();
		total= (hora * 3600) + (minuto * 60) + (segundo * 1);
		if(hora >= 0 && hora < 24 && minuto >= 0 && segundo >= 0 && total < 86400) {
			System.out.println("Se passaram " + total + " segundos desde a meia noite");
		}else {
			System.out.println("Essa hora não existe, tente novamente");
		}
		t.close();
		
	}

}
