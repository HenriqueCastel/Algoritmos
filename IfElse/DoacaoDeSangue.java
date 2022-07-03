package IfElse;
/*Faça um programa para saber se a pessoa pode ou não doar sangue, sabendo que para 
doar sangue a pessoa precisa: ter entre 18 e 67 anos, pesar no mínimo 50 quilos, estar
em jejum,ter documento com foto, não ter tido epatite depois dos 10 anos e não ter 
malária, se a pessoa não atender a um desses requisitos retorna "Você não pode doar
sangue", se não retorna "Você pode doar sangue" e pergunta qual o sexo do usuário, se
for masculino retorna: "Você pode doar novamente daqui 60 dias", se for feminino 
retorna "Você pode doar novamente daqui 90 dias*/
import java.util.Scanner;

public class DoacaoDeSangue {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade= t.nextInt();
		if(idade < 18 || idade > 67) {
			System.out.println("Você não pode doar sangue");
		}else {
			System.out.println("Qual seu peso?");
			double peso= t.nextDouble();
			if(peso < 50) {
				System.out.println("Você não pode doar sangue");
			}else {
				System.out.println("Você está em jejum?");
				String jejum= t.next();
				if(jejum.equalsIgnoreCase("não")) {
					System.out.println("Você não pode doar sangue");
				}
				if(jejum.equalsIgnoreCase("sim")) {
				    System.out.println("Você tem documento com foto?");
				    String documento= t.next();
				    if(documento.equalsIgnoreCase("não")) {
				    	System.out.println("Você não pode doar sangue");
				    }
				    if(documento.equalsIgnoreCase("sim")) {
				    	System.out.println("Você teve epatite depois dos 10 anos?");
				    	String epatite= t.next();
				    	if(epatite.equalsIgnoreCase("sim")) {
				    		System.out.println("Você não pode doar sangue");
				    	}
				    	if(epatite.equalsIgnoreCase("não")) {
				    		System.out.println("Você tem malária?");
				    		String malaria= t.next();
				    		if(malaria.equalsIgnoreCase("sim")) {
				    			System.out.println("Você não pode doar sangue");
				    		}
				    		if(malaria.equalsIgnoreCase("não")) {
				    			System.out.println("Você pode doar sangue");
				    			System.out.println("Qual seu sexo?");
				    			String sexo= t.next();
				    			if(sexo.equalsIgnoreCase("masculino")) {
				    				System.out.println("Você pode doar novamente daqui 60 dias");
				    			}
				    			if(sexo.equalsIgnoreCase("feminino")) {
				    				System.out.println("Você pode doar novamente daqui 30 dias");
				    			}
				    		}
				    	}
				    }
				}
			}
		}
		t.close();
		
	}

}
