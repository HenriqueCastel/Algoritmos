package ForDoWhile;
/*Mostre a soma de todos os números entre 23 e 54.*/
public class SomaEntre23e54 {
	public static void main(String[]args) {
		int x, soma= 0;
		for(x= 23; x <= 54; x++) {
			soma= soma + x;
			System.out.println(soma);
		}

	}

}
