package ForDoWhile;
/*Fa�a um programa que mostra a soma dos n�meros de 19 a 219, somando 8 a cada soma.*/
public class SomaEntre19a219somando8 {
	public static void main(String[]args) {
		int x, soma= 0;
		for(x= 19; x <= 219; x++) {
			soma= soma + x;
			System.out.println(soma + 8);
		}
	}

}
