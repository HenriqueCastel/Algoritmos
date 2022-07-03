package ForDoWhile;
/*Mostre a soma de todos os pares de 1 a 50 e mostra quantos números foram usados.*/
public class SomaDosParesDe1a50 {
	public static void main(String[]args) {
		int x, soma= 0, cont= 0;
		for(x= 0; x < 50; x++) {
			if(x % 2 == 0) {
				soma= soma+ x;
				cont++;
			}
			System.out.println(soma);
		}
		System.out.println(cont + " números foram usados");
	}

}
