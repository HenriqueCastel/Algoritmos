package Metodos;
/*10.Os números palíndromos são aqueles que escritos da direita para a esquerda têm o 
mesmo valor quando escritos da esquerda para a direita. Por exemplo 545; 97379; 
123454321; etc. Faça um método que recebe um número inteiro e retorna este número 
escrito ao contrário. A seguir, desenvolva outro método usando o método anterior, mas 
que mostre todos os palíndromos entre 1000 e 10000.*/
import java.util.Scanner;

public class Ex10 {
	public static void testaPalindromo(){
		int teste = 4;
		String numero;
		int auxiliar = 0;
		for (int a= 1000; a < 10000; a++){
			if (a <= 9999){
			} else {teste ++; }
			
			numero = Integer.toString(a);
			for (int i= 0; i < teste; i++) {
				if (numero.charAt(i) != numero.charAt(numero.length()- i - 1)) {
					
				}else{
					auxiliar ++; 	
				}
			}
			if(auxiliar >= 4) {
				System.out.println(numero);
			}
			 auxiliar = 0;

		}
		
	}
		
	public static void numeroContrario() {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite um número");
		String numero= t.next();
		int i;
		for(i = numero.length() - 1; i >= 0; i --){
			System.out.print(numero.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		numeroContrario();
		testaPalindromo();
		
		
	}
}

