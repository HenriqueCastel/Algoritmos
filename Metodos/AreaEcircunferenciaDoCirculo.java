package Metodos;
/*Faça um programa que leia 5 valores que representam raios de círculos. Para cada 
valor informado imprimir a área e seu perímetro. Para obter o valor da área do círculo
o programa deverá chamar a função AreaCirculo Para obter o valor do seu perímetro o 
programa deverá chamar a função ComprimentoCircunferencia.
a) AreaCirculo - a função retorna a área do círculo de raio especificado. Entrada de 
dados: raio
b) ComprimentoCircunferencia - a função retorna o comprimento da circunferência de 
raio especificado. Entrada de dados: raio*/
import java.util.Scanner; 

public class AreaEcircunferenciaDoCirculo {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite o raio:");
		double raio= t.nextDouble();
		System.out.println(areaCirculo(raio));
		System.out.println(comprimentoCirculo(raio));
		t.close();
	}
	public static double areaCirculo(double r) { 
		double resultado= 3.14 * (r * r); 
		return resultado;		
	}
	public static double comprimentoCirculo(double raio) { 
		double resultado= 2 * 3.14 * raio; 
		return resultado;
	}
}

