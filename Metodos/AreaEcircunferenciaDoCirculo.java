package Metodos;
/*Fa�a um programa que leia 5 valores que representam raios de c�rculos. Para cada 
valor informado imprimir a �rea e seu per�metro. Para obter o valor da �rea do c�rculo
o programa dever� chamar a fun��o AreaCirculo Para obter o valor do seu per�metro o 
programa dever� chamar a fun��o ComprimentoCircunferencia.
a) AreaCirculo - a fun��o retorna a �rea do c�rculo de raio especificado. Entrada de 
dados: raio
b) ComprimentoCircunferencia - a fun��o retorna o comprimento da circunfer�ncia de 
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

