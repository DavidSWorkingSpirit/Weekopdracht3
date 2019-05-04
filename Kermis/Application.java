package Kermis;

import java.util.Random;
import java.util.Scanner;

public class Application {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		Random randy = new Random();
		int inspecteurBeurt = randy.nextInt(15) + 1;
		int beurt = 1;
		
		Kassa kassa = new Kassa();
		Botsauto bots = new Botsauto();
		Spin spin = new Spin();
		Spiegelpaleis spiegel = new Spiegelpaleis();
		Spookhuis spook = new Spookhuis();
		Hawaii hawaii = new Hawaii();
		Ladderklimmen ladder = new Ladderklimmen();
		
		boolean running = true;
		
		System.out.println("Voor elke attractie wordt een kaartje gekocht? 1. Botsauto's, 2. De Spin, 3. Spiegelpaleis, 4. Spookhuis, 5. Hawaii, 6. Ladderklimmen.");
		System.out.println("Of bekijk de omzet (o) of het aantal verkochte kaartjes (k). Met 's' sluit de kermis.");
		System.out.println("Voer het getal in voor de attractie:");
		
		while(running)	{
			String invoer = sc.nextLine().toLowerCase();
			
			switch(invoer) {
				case "1": {
					bots.setName("botsauto's");
					bots.setPrijs(2.50);
					bots.draaien();
//					bots.aantalKaartjes = bots.aantalKaartjes + 1;
//					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//					bots.omzet = bots.omzet + bots.prijs;
					break;
				}
				case "2": {
					spin.setName("de Spin");
					spin.setDraaiLimiet(5);
					spin.setPrijs(2.25);
					if (spin.aantalGedraaid != spin.draaiLimiet) {
						spin.draaien();
//						spin.aantalKaartjes = spin.aantalKaartjes + 1;
//						Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//						spin.omzet = spin.omzet + spin.prijs;
						spin.aantalGedraaid++;
						break;
					}
					else {
						try {
							throw new Exception();
						}
						catch (Exception e) {
							System.out.println("Deze attractie is toe aan een onderhoudsbeurt. Voer 'm' in om de monteur te laten komen.");
						}
						break;
					}
				}
				case "3": {
					spiegel.setName("spiegelpaleis");
					spiegel.setPrijs(2.75);
					spiegel.draaien();
//					spiegel.aantalKaartjes = spiegel.aantalKaartjes + 1;
//					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//					spiegel.omzet = spiegel.omzet + spiegel.prijs;
					break;
				}
				case "4": {
					spook.setName("spookhuis");
					spook.setPrijs(3.20);
					spook.draaien();
//					spook.aantalKaartjes = spook.aantalKaartjes + 1;
//					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//					spook.omzet = spook.omzet + spook.prijs;
					break;
				}
				case "5": {
					hawaii.setName("hawaii");
					hawaii.setDraaiLimiet(10);
					hawaii.setPrijs(2.90);
					if (hawaii.aantalGedraaid != hawaii.draaiLimiet) {
					hawaii.draaien();
//					hawaii.aantalKaartjes = hawaii.aantalKaartjes + 1;
//					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//					hawaii.omzet = hawaii.omzet + hawaii.prijs;
					hawaii.aantalGedraaid++;
					break;
					}
					else {
						try {
							throw new Exception();
						}
						catch (Exception e) {
							System.out.println("Deze attractie is toe aan een onderhoudsbeurt. Voer 'm' in om de monteur te laten komen.");
						}
						break;
					}
				}
				case "6": {
					ladder.setName("ladderklimmen");
					ladder.setPrijs(5.00);
					ladder.draaien();
//					ladder.aantalKaartjes = ladder.aantalKaartjes + 1;
//					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
//					ladder.omzet = ladder.omzet + ladder.prijs;
					break;
				}
				case "m": {
					System.out.println("Voor welke attractie moet de monteur langskomen? 'Spin' of 'Hawaii'?");
					String imput = sc.nextLine().toLowerCase();
					
					switch(imput) {
						case "spin": {
							spin.opstellingsKeuring();
							System.out.println("Monteur Mandy heeft de Spin gecheckt en kan weer draaien!");
							break;
						}
						case "hawaii": {
							hawaii.opstellingsKeuring();
							System.out.println("Monteur Mandy heeft Hawaii gecheckt en kan weer draaien!");
							break;
						}
					}
					break;
				}
				case "o": {
					kassa.omzetTotaal(	bots.naam, bots.omzet,
										spin.naam, spin.totaalOmzet,
										spiegel.naam, spiegel.omzet,
										spook.naam, spook.omzet,
										hawaii.naam, hawaii.omzet,
										ladder.naam, ladder.totaalOmzet,
										spin.omzet, ladder.omzet);
					break;
				}
				case "k": {
					kassa.kaartjesTotaal(	bots.naam, bots.aantalKaartjes, 
											spin.naam, spin.aantalKaartjes, 
											spiegel.naam, spiegel.aantalKaartjes, 
											spook.naam, spook.aantalKaartjes, 
											hawaii.naam, hawaii.aantalKaartjes, 
											ladder.naam, ladder.aantalKaartjes);
					break;
				}
				case "s": {
					System.out.println("De kermis is gesloten.");
					running = false;
					break;
				}
				default: {
					System.out.println("Deze invoer is onjuist. Voer een getal in van 1 t/m 6. Of 'o' voor omzet en 'k' voor het aantal verkochte kaartjes.");
				}
			}
			
			// De belastinginspecteur
			if (beurt == inspecteurBeurt) {
				System.out.println("Belastinginspecteur Bob komt langs om de belasting te innen!");
				ladder.kansSpelBelastingBetalen();
				spin.kansSpelBelastingBetalen();
				inspecteurBeurt = randy.nextInt(15) + 1;
				beurt = 1;
			}
			
			beurt++;
		}	
	}
}
