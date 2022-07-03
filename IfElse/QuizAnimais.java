package IfElse;
/*Faça um algoritmo que retorna qual o animal que o usuário escolheu dentre os 
disponíveis, ele chegará a um resultado através de várias perguntas. Leão: mamífero, 
quadrúpede e carnívoro; Cavalo: mamífero, quadrúpede e herbívoro; Humano: mamífero,
bípede e onívoro; Macaco: mamífero, bípede, frutífero; Morcego: mamífero, voador;
Baleia: mamífero, aquático; Avestruz: ave, não voador, tropical; Penguim: ave, não 
voador, polar; Pato: ave, nadador; Águia: ave, de rapina; Tartaruga: réptil, com 
casco; Crocodilo: réptil, carnívoro; Cobra: réptil, sem patas. Se não tiver de acordo
com nenhum desses retorna que o animal não existe.*/
import java.util.Scanner;

public class QuizAnimais {
	public static void main(String[]args) {
		Scanner t= new Scanner(System.in);
		System.out.println("Escolha um desses animais e responda sempre com sim ou "
				+ "não: leão, cavalo, humano, macaco, morcego, baleia, avestruz, "
				+ "penguim, pato, águia, tartaruga, crocodilo, cobra");
		System.out.println("Seu animal é mamífero?");
		String mamifero= t.next();
		if(mamifero.equalsIgnoreCase("sim")) {
			System.out.println("Quadrúpede?");
			String quadrupede= t.next();
			if(quadrupede.equalsIgnoreCase("sim")) {
				System.out.println("Carnívoro?");
				String carnivoro= t.next();
				if(carnivoro.equalsIgnoreCase("sim")) {
					System.out.println("Seu animal é o leão");
				}
				if(carnivoro.equalsIgnoreCase("não")) {
					System.out.println("Herbívoro?");
					String herbivoro= t.next();
					if(herbivoro.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal é o cavalo");
					}
					if(herbivoro.equalsIgnoreCase("não")) {
						System.out.println("Esse animal não existe");
					}
				}
			}
			if(quadrupede.equalsIgnoreCase("não")) {
				System.out.println("Bípede?");
				String bipede= t.next();
				if(bipede.equalsIgnoreCase("sim")) {
					System.out.println("Onívoro?");
					String onivoro= t.next();
					if(onivoro.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal é o humano");
					}
					if(onivoro.equalsIgnoreCase("não")) {
						System.out.println("Seu animal é frutífero?");
						String frutifero= t.next();
						if(frutifero.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal é o macaco");
						}
						if(frutifero.equalsIgnoreCase("não")) {
							System.out.println("Esse animal não existe");
						}
					}
				}
				if(bipede.equalsIgnoreCase("não")) {
					System.out.println("Voador?");
					String voador= t.next();
					if(voador.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal é o morcego");
					}
					if(voador.equalsIgnoreCase("não")) {
						System.out.println("Aquático?");
						String aquatico= t.next();
						if(aquatico.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal é a baleia");
						}
						if(aquatico.equalsIgnoreCase("não")) {
							System.out.println("Esse animal não existe");
						}
					}
				}
			}
		}
		if(mamifero.equalsIgnoreCase("não")) {
			System.out.println("Ave?");
			String ave= t.next();
			if(ave.equalsIgnoreCase("sim")) {
				System.out.println("Não voador?");
				String naovoador= t.next();
				if(naovoador.equalsIgnoreCase("sim")) {
					System.out.println("Tropical?");
					String tropical= t.next();
					if(tropical.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal é o avestruz");
					}
					if(tropical.equalsIgnoreCase("não")) {
						System.out.println("Polar?");
						String polar= t.next();
						if(polar.equalsIgnoreCase("sim")) {
							System.out.println("Seu animal é o penguim");
						}
						if(polar.equalsIgnoreCase("não")) {
							System.out.println("Esse animal não existe");
						}
					}
				}
				if(naovoador.equalsIgnoreCase("não")) {
					System.out.println("Nadador?");
				    String nadador= t.next();
				    if(nadador.equalsIgnoreCase("sim")) {
				    	System.out.println("Seu animal é o pato");
				    }
				    if(nadador.equalsIgnoreCase("não")) {
				    	System.out.println("De rapina?");
				    	String derapina= t.next();
				    	if(derapina.equalsIgnoreCase("sim")) {
				    		System.out.println("Seu animal é a águia");
				    	}
				    	if(derapina.equalsIgnoreCase("não")) {
				    		System.out.println("Esse animal não existe");
				    	}
				    }
				}
			}
			if(ave.equalsIgnoreCase("não")) {
				System.out.println("Réptil?");
				String reptil= t.next();
				if(reptil.equalsIgnoreCase("sim")) {
					System.out.println("Com casco?");
					String comcasco= t.next();
					if(comcasco.equalsIgnoreCase("sim")) {
						System.out.println("Seu animal é a tartaruga");
					}
					if(comcasco.equalsIgnoreCase("não")) {
						System.out.println("Carnívoro?");
						String carnivoro= t.next();
						if(carnivoro.equalsIgnoreCase("sim")) {
							System.out.println("Esse animal é o crocodilo");
						}
						if(carnivoro.equalsIgnoreCase("não")) {
							System.out.println("Sem patas?");
							String sempatas= t.next();
							if(sempatas.equalsIgnoreCase("sim")) {
								System.out.println("Seu animal é a cobra");
							}
							if(sempatas.equalsIgnoreCase("não")) {
								System.out.println("Esse animal não existe");
							}
						}
					}
				}
			}
		}
		t.close();
	}

}
