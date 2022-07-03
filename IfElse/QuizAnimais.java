package IfElse;
/*Fa�a um algoritmo que retorna qual o animal que o usu�rio escolheu dentre os 
dispon�veis, ele chegar� a um resultado atrav�s de v�rias perguntas. Le�o: mam�fero, 
quadr�pede e carn�voro; Cavalo: mam�fero, quadr�pede e herb�voro; Humano: mam�fero,
b�pede e on�voro; Macaco: mam�fero, b�pede, frut�fero; Morcego: mam�fero, voador;
Baleia: mam�fero, aqu�tico; Avestruz: ave, n�o voador, tropical; Penguim: ave, n�o 
voador, polar; Pato: ave, nadador; �guia: ave, de rapina; Tartaruga: r�ptil, com 
casco; Crocodilo: r�ptil, carn�voro; Cobra: r�ptil, sem patas. Se n�o tiver de acordo
com nenhum desses retorna que o animal n�o existe.*/
import java.util.Scanner;

public class QuizAnimais {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Escolha um desses animais e responda sempre com sim ou "
				+ "n�o: le�o, cavalo, humano, macaco, morcego, baleia, avestruz, "
				+ "penguim, pato, �guia, tartaruga, crocodilo, cobra");
		System.out.println("Seu animal � mam�fero?");
		String mamifero= t.next();
		if(mamifero.equalsIgnoreCase("sim")) {
			System.out.println("Quadr�pede?");
			String quadrupede= t.next();
			if(quadrupede.equalsIgnoreCase("sim")) {
				System.out.println("Carn�voro?");
				String carnivoro= t.next();
				if(carnivoro.equalsIgnoreCase("sim")) {
					System.out.println("Seu animal � o le�o");
				}
				if(carnivoro.equalsIgnoreCase("n�o")) {
					System.out.println("Herb�voro?");
					String herbivoro= t.next();
					if(herbivoro.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal � o cavalo");
					}
					if(herbivoro.equalsIgnoreCase("n�o")) {
						System.out.println("Esse animal n�o existe");
					}
				}
			}
			if(quadrupede.equalsIgnoreCase("n�o")) {
				System.out.println("B�pede?");
				String bipede= t.next();
				if(bipede.equalsIgnoreCase("sim")) {
					System.out.println("On�voro?");
					String onivoro= t.next();
					if(onivoro.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal � o humano");
					}
					if(onivoro.equalsIgnoreCase("n�o")) {
						System.out.println("Seu animal � frut�fero?");
						String frutifero= t.next();
						if(frutifero.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal � o macaco");
						}
						if(frutifero.equalsIgnoreCase("n�o")) {
							System.out.println("Esse animal n�o existe");
						}
					}
				}
				if(bipede.equalsIgnoreCase("n�o")) {
					System.out.println("Voador?");
					String voador= t.next();
					if(voador.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal � o morcego");
					}
					if(voador.equalsIgnoreCase("n�o")) {
						System.out.println("Aqu�tico?");
						String aquatico= t.next();
						if(aquatico.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal � a baleia");
						}
						if(aquatico.equalsIgnoreCase("n�o")) {
							System.out.println("Esse animal n�o existe");
						}
					}
				}
			}
		}
		if(mamifero.equalsIgnoreCase("n�o")) {
			System.out.println("Ave?");
			String ave= t.next();
			if(ave.equalsIgnoreCase("sim")) {
				System.out.println("N�o voador?");
				String naovoador= t.next();
				if(naovoador.equalsIgnoreCase("sim")) {
					System.out.println("Tropical?");
					String tropical= t.next();
					if(tropical.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal � o avestruz");
					}
					if(tropical.equalsIgnoreCase("n�o")) {
						System.out.println("Polar?");
						String polar= t.next();
						if(polar.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal � o penguim");
						}
						if(polar.equalsIgnoreCase("n�o")) {
							System.out.println("Esse animal n�o existe");
						}
					}
				}
				if(naovoador.equalsIgnoreCase("n�o")) {
					System.out.println("Nadador?");
				    String nadador= t.next();
				    if(nadador.equalsIgnoreCase("sim")) {
				    	System.out.println("Seu animal � o pato");
				    }
				    if(nadador.equalsIgnoreCase("n�o")) {
				    	System.out.println("De rapina?");
				    	String derapina= t.next();
				    	if(derapina.equalsIgnoreCase("sim")) {
				    		System.out.println("Seu animal � a �guia");
				    	}
				    	if(derapina.equalsIgnoreCase("n�o")) {
				    		System.out.println("Esse animal n�o existe");
				    	}
				    }
				}
			}
			if(ave.equalsIgnoreCase("n�o")) {
				System.out.println("R�ptil?");
				String reptil= t.next();
				if(reptil.equalsIgnoreCase("sim")) {
					System.out.println("Com casco?");
					String comcasco= t.next();
					if(comcasco.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal � a tartaruga");
					}
					if(comcasco.equalsIgnoreCase("n�o")) {
						System.out.println("Carn�voro?");
						String carnivoro= t.next();
						if(carnivoro.equalsIgnoreCase("sim")) {
							System.out.println("Esse animal � o crocodilo");
						}
						if(carnivoro.equalsIgnoreCase("n�o")) {
							System.out.println("Sem patas?");
							String sempatas= t.next();
							if(sempatas.equalsIgnoreCase("sim")) {
								System.out.println("Seu animal � a cobra");
							}
							if(sempatas.equalsIgnoreCase("n�o")) {
								System.out.println("Esse animal n�o existe");
							}
						}
					}
				}
			}
		}
		t.close();
	}

}
