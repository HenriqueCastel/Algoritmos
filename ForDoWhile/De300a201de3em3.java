package ForDoWhile;
/*Faça um programa que mostra os valores em ordem decrescente de 300 até 201, indo de 
3 em 3.*/
public class De300a201de3em3 {
	public static void main(String[]args) {
		int x= 300;
		while(x >= 201) {
			System.out.println(x);
			x -= 3;
		}
	}

}
