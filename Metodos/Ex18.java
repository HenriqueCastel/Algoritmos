package Metodos;
/*18.Reduzindo frases: Fa�a um programa que reduza uma string a um tamanho definido 
pelo usu�rio, jogando fora os caracteres que n�o couberem nesse tamanho 
(se existirem). O programa deve acrescentar retic�ncias ("...") � string caso esses 
caracteres extras sejam jogados fora, mas mesmo assim a string n�o pode ultrapassar o 
tamanho explicitado pelo usu�rio. O programa deve permitir que o usu�rio digite v�rios
tamanhos desejados, e deve encerrar quando ele digitar o valor 0(zero). Para fazer a 
redu��o, crie uma fun��o chamada Reduza, que receba dois par�metros: a string e o 
tamanho ao qual ela deve ser reduzido. Essa fun��o n�o deve imprimir nada na tela, e
deve retornar a string j� reduzida. Veja o exemplo a seguir. Repare que, se a string 
original tiver 35 caracteres, e o tamanho especificado for 15, ent�o ir�o sobrar 12 
caracteres da string original acrescidos de "...".
1 Digite uma senten�a:
2 O rato roeu a roupa do rei de Roma.
3
4 Digite um tamanho:
5 15
6 A senten�a foi reduzida para:
7 O rato roeu ...
8
9 Digite um tamanho:
10 20
11 A senten�a foi reduzida para:
12 O rato roeu a rou...
13
14 Digite um tamanho:
15 100
16 A senten�a n�o foi reduzida:
17 O rato roeu a roupa do rei de Roma.
18
19 Digite um tamanho:
20 2
21 A senten�a foi reduzida para:
22 ..
23
24 Digite um tamanho:
25 0
26 Fim do programa.*/
import java.util.Scanner;

public class Ex18 {
	public static void reduza(String a, int b) {
		System.out.println("A senten�a foi reduzida para: ");
		if(b == 1){
			System.out.print(" .");
		}else{
			if(b == 2){
				System.out.print(" . .");
			}else{
				if(b == 3){
					System.out.print(" . . .");
				}else{
					if(b >= a.length()){
						System.out.print(a);
					}else{
						if(b >= 3){
							for(int x= 0; b-3>x; x++){
								System.out.print(a.substring(x, x + 1));
							}
							System.out.print(" . . .");
						}
					}
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Digite uma senten�a:");
		String a= t.nextLine();
		int b= 1;
		while(b != 0){
			System.out.println("Digite um tamanho: ");
			b= t.nextInt();
			if(b != 0){
				reduza(a, b);
			}
		}
	}

}