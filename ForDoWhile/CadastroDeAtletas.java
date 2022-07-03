package ForDoWhile;
/*Faça um programa em que o usuário tem que cadastar: nome, sexo, peso, altura e idade
de um atleta, o algoritmo termina quando o usuário digitar "@". Retorna o nome do mais 
alto, o nome do mais gordo, a média de idade dos atletas e o nome do mais jovem.*/
import java.util.Scanner;

public class CadastroDeAtletas {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		String nome, sexo, maisAlto= "", maisPesada= "", maisJovem= "";
		int idade, menorIdade= 999, cont= 0;
		double peso, altura, maiorAltura= -1, maiorPeso= -1, soma= 0, media= 0;
		System.out.println("Cadastro de atletas, para terminar, digite '@'");
		do {
			System.out.println("Digite o nome:");
			nome= t.next();
			if(!nome.equals("@")) {
				System.out.println("Digite o sexo:");
				sexo= t.next();
				System.out.println("Digite o peso:");
				peso= t.nextDouble();
				System.out.println("Digite a altura:");
				altura= t.nextDouble();
				System.out.println("Digite a idade:");
				idade= t.nextInt();
				soma= idade + soma;
				cont= cont + 1;
				media= soma / cont;
				if(sexo.equalsIgnoreCase("masculino")) {
					if(altura > maiorAltura) {
						maiorAltura= altura;
						maisAlto= nome;
					}
				}
				if(sexo.equalsIgnoreCase("feminino")) {
					if(peso > maiorPeso) {
						maiorPeso= peso;
						maisPesada= nome;
					}
				}
				if(idade < menorIdade) {
					menorIdade= idade;
					maisJovem= nome;
				}
			}
		}while(!nome.equals("@"));
		System.out.println("Atleta mais alto: " + maisAlto);
		System.out.println("Atleta mais pesado: " + maisPesada);
		System.out.println("Média de idade dos atletas: " + media);
		System.out.println("Atleta mais jovem: " + maisJovem);
		t.close();
	}

}
