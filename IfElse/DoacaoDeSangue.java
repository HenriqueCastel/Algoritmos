package IfElse;
/*Fa�a um programa para saber se a pessoa pode ou n�o doar sangue, sabendo que para 
doar sangue a pessoa precisa: ter entre 18 e 67 anos, pesar no m�nimo 50 quilos, estar
em jejum,ter documento com foto, n�o ter tido epatite depois dos 10 anos e n�o ter 
mal�ria, se a pessoa n�o atender a um desses requisitos retorna "Voc� n�o pode doar
sangue", se n�o retorna "Voc� pode doar sangue" e pergunta qual o sexo do usu�rio, se
for masculino retorna: "Voc� pode doar novamente daqui 60 dias", se for feminino 
retorna "Voc� pode doar novamente daqui 90 dias*/
import java.util.Scanner;

public class DoacaoDeSangue {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade= t.nextInt();
		if(idade < 18 || idade > 67) {
			System.out.println("Voc� n�o pode doar sangue");
		}else {
			System.out.println("Qual seu peso?");
			double peso= t.nextDouble();
			if(peso < 50) {
				System.out.println("Voc� n�o pode doar sangue");
			}else {
				System.out.println("Voc� est� em jejum?");
				String jejum= t.next();
				if(jejum.equalsIgnoreCase("n�o")) {
					System.out.println("Voc� n�o pode doar sangue");
				}
				if(jejum.equalsIgnoreCase("sim")) {
				    System.out.println("Voc� tem documento com foto?");
				    String documento= t.next();
				    if(documento.equalsIgnoreCase("n�o")) {
				    	System.out.println("Voc� n�o pode doar sangue");
				    }
				    if(documento.equalsIgnoreCase("sim")) {
				    	System.out.println("Voc� teve epatite depois dos 10 anos?");
				    	String epatite= t.next();
				    	if(epatite.equalsIgnoreCase("sim")) {
				    		System.out.println("Voc� n�o pode doar sangue");
				    	}
				    	if(epatite.equalsIgnoreCase("n�o")) {
				    		System.out.println("Voc� tem mal�ria?");
				    		String malaria= t.next();
				    		if(malaria.equalsIgnoreCase("sim")) {
				    			System.out.println("Voc� n�o pode doar sangue");
				    		}
				    		if(malaria.equalsIgnoreCase("n�o")) {
				    			System.out.println("Voc� pode doar sangue");
				    			System.out.println("Qual seu sexo?");
				    			String sexo= t.next();
				    			if(sexo.equalsIgnoreCase("masculino")) {
				    				System.out.println("Voc� pode doar novamente daqui 60 dias");
				    			}
				    			if(sexo.equalsIgnoreCase("feminino")) {
				    				System.out.println("Voc� pode doar novamente daqui 30 dias");
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
