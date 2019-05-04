package Kermis;

import java.util.Random;
import java.util.Scanner;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static int beurt = 1;
		
	public static void main(String[] args) {
		Random randy = new Random();
		int inspecteurBeurt = randy.nextInt(15) + 1;
		
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
					bots.draaien("botsauto's", 2.50);
					break;
				}
				case "2": {
					spin.setDraaiLimiet(5);
					if (spin.aantalGedraaid != spin.draaiLimiet) {
						spin.draaien("de Spin", 2.25);
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
					spiegel.draaien("spiegelpaleis", 2.75);
					break;
				}
				case "4": {
					spook.draaien("spookhuis", 3.20);
					break;
				}
				case "5": {
					hawaii.setDraaiLimiet(10);
					if (hawaii.aantalGedraaid != hawaii.draaiLimiet) {
					hawaii.draaien("hawaii", 2.90);
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
					ladder.draaien("ladderklimmen", 5.00);
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
		}	
	}
}
