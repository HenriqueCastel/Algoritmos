package Metodos;
/*18.Reduzindo frases: Faça um programa que reduza uma string a um tamanho definido 
pelo usuário, jogando fora os caracteres que não couberem nesse tamanho 
(se existirem). O programa deve acrescentar reticências ("...") à string caso esses 
caracteres extras sejam jogados fora, mas mesmo assim a string não pode ultrapassar o 
tamanho explicitado pelo usuário. O programa deve permitir que o usuário digite vários
tamanhos desejados, e deve encerrar quando ele digitar o valor 0(zero). Para fazer a 
redução, crie uma função chamada Reduza, que receba dois parâmetros: a string e o 
tamanho ao qual ela deve ser reduzido. Essa função não deve imprimir nada na tela, e
deve retornar a string já reduzida. Veja o exemplo a seguir. Repare que, se a string 
original tiver 35 caracteres, e o tamanho especificado for 15, então irão sobrar 12 
caracteres da string original acrescidos de "...".
1 Digite uma sentença:
2 O rato roeu a roupa do rei de Roma.
3
4 Digite um tamanho:
5 15
6 A sentença foi reduzida para:
7 O rato roeu ...
8
9 Digite um tamanho:
10 20
11 A sentença foi reduzida para:
12 O rato roeu a rou...
13
14 Digite um tamanho:
15 100
16 A sentença não foi reduzida:
17 O rato roeu a roupa do rei de Roma.
18
19 Digite um tamanho:
20 2
21 A sentença foi reduzida para:
22 ..
23
24 Digite um tamanho:
25 0
26 Fim do programa.*/
import java.util.Scanner;

public class Ex18 {
	public static void reduza(String a, int b) {
		System.out.println("A sentença foi reduzida para: ");
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
		System.out.println("Digite uma sentença:");
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