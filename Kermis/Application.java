package Kermis;

import java.util.Scanner;

public class Application {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		Kassa kassa = new Kassa();
		
		Botsauto bots = new Botsauto();
		Spin spin = new Spin();
		Spiegelpaleis spiegel = new Spiegelpaleis();
		Spookhuis spook = new Spookhuis();
		Hawaii hawaii = new Hawaii();
		Ladderklimmen ladder = new Ladderklimmen();
		
		boolean running = true;
		
		while(running)	{
			String invoer = sc.nextLine();
			
			switch(invoer) {
				case "1": {
					bots.setName("botsauto's");
					bots.setPrijs(2.50);
					bots.draaien();
					bots.aantalKaartjes = bots.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					bots.omzet = bots.omzet + bots.prijs;
					break;
				}
				case "2": {
					spin.setName("de Spin");
					spin.setDraaiLimiet(5);
					if(spin.aantalGedraaid == spin.draaiLimiet) {
						spin.opstellingsKeuring();
						break;
					}
					spin.setPrijs(2.25);
					spin.draaien();
					spin.aantalKaartjes = spin.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					spin.omzet = spin.omzet + spin.prijs;
					spin.aantalGedraaid++;
					break;
				}
				case "3": {
					spiegel.setName("spiegelpaleis");
					spiegel.setPrijs(2.75);
					spiegel.draaien();
					spiegel.aantalKaartjes = spiegel.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					spiegel.omzet = spiegel.omzet + spiegel.prijs;
					break;
				}
				case "4": {
					spook.setName("spookhuis");
					spook.setPrijs(3.20);
					spook.draaien();
					spook.aantalKaartjes = spook.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					spook.omzet = spook.omzet + spook.prijs;
					break;
				}
				case "5": {
					hawaii.setName("hawaii");
					hawaii.setDraaiLimiet(10);
					if(hawaii.aantalGedraaid == hawaii.draaiLimiet) {
						hawaii.opstellingsKeuring();
						break;
					}
					hawaii.setPrijs(2.90);
					hawaii.draaien();
					hawaii.aantalKaartjes = hawaii.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					hawaii.omzet = hawaii.omzet + hawaii.prijs;
					hawaii.aantalGedraaid++;
					break;
				}
				case "6": {
					ladder.setName("ladderklimmen");
					ladder.setPrijs(5.00);
					ladder.draaien();
					ladder.aantalKaartjes = ladder.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					ladder.omzet = ladder.omzet + ladder.prijs;
					ladder.kansSpelBelastingBetalen(0.30);
					break;
				}
				case "o": {
					kassa.omzetTotaal(bots.omzet, spin.omzet, spiegel.omzet, spook.omzet, hawaii.omzet, ladder.omzetLadder);
					System.out.println("De omzet van de attractie " + bots.naam + " is " + bots.omzet + " euro.");
					System.out.println("De omzet van de attractie " + spin.naam + " is " + spin.omzet + " euro.");
					System.out.println("De omzet van de attractie " + spiegel.naam + " is " + spiegel.omzet + " euro.");
					System.out.println("De omzet van de attractie " + spook.naam + " is " + spook.omzet + " euro.");
					System.out.println("De omzet van de attractie " + hawaii.naam + " is " + hawaii.omzet + " euro.");
					System.out.println("De omzet van de attractie " + ladder.naam + " is " + ladder.omzetLadder + " euro.");
					break;
				}
				case "k": {
					System.out.println("Het totale aantal verkochte kaartjes is: " + Attractie.totaalKaartjesVerkocht + ".");
					System.out.println("Voor de attractie " + bots.naam + " zijn " + bots.aantalKaartjes + " kaartjes gekocht.");
					System.out.println("Voor de attractie " + spin.naam + " zijn " + spin.aantalKaartjes + " kaartjes gekocht.");
					System.out.println("Voor de attractie " + spiegel.naam + " zijn " + spiegel.aantalKaartjes + " kaartjes gekocht.");
					System.out.println("Voor de attractie " + spook.naam + " zijn " + spook.aantalKaartjes + " kaartjes gekocht.");
					System.out.println("Voor de attractie " + hawaii.naam + " zijn " + hawaii.aantalKaartjes + " kaartjes gekocht.");
					System.out.println("Voor de attractie " + ladder.naam + " zijn " + ladder.aantalKaartjes + " kaartjes gekocht.");
					break;
				}
				default: {
					System.out.println("Deze invoer is onjuist. Voer een getal in van 1 t/m 6. Of 'o' voor omzet en 'k' voor het aantal verkochte kaartjes.");
				}
			}
		}	
	}
}

class Attractie {
	
	String naam;
	double prijs;
	int oppervlakte;
	static int totaalKaartjesVerkocht;
	
	void draaien() {
		
	}
	
	void setName(String naam) {
		this.naam = naam;
	}
	
	void setPrijs(double prijs) {
		this.prijs = prijs;
	}
}

abstract class RisicoRijkeAttracties extends Attractie{
	
	int draaiLimiet;
	
	abstract void opstellingsKeuring();
	
	void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}
}

interface GokAttractie {
	
	void kansSpelBelastingBetalen(double belasting);
}

class Botsauto extends Attractie {

	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
}

class Spin extends RisicoRijkeAttracties {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	int aantalGedraaid = 0;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
	
	void opstellingsKeuring() {
		System.out.println("De attractie \"" + this.naam + "\" ondergaat een onderhoudsbeurt en mag niet draaien voordat een andere attractie heeft gedraait.");
		this.aantalGedraaid = 0;
	}
}

class Spiegelpaleis extends Attractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
}

class Spookhuis extends Attractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
}

class Hawaii extends RisicoRijkeAttracties {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	int aantalGedraaid = 0;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
	
	void opstellingsKeuring() {
		System.out.println("De attractie \"" + this.naam + "\" ondergaat een onderhoudsbeurt en mag niet draaien voordat een andere attractie heeft gedraait.");
		this.aantalGedraaid = 0;
	}
}

class Ladderklimmen extends Attractie implements GokAttractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	double omzetMetBelasting;
	double omzetLadder;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
	
	public void kansSpelBelastingBetalen(double belasting) {
		omzetMetBelasting = omzet - omzet * belasting;
		omzetLadder = omzetLadder + omzetMetBelasting;
		omzet = 0;
	}
}

class Kassa {
	
	double totaalOmzet = 0.00;
	
	void omzetTotaal(double botsautoOmzet, double spinOmzet, double spiegelOmzet, double spookOmzet, double hawaiiOmzet, double ladderOmzet) {
		totaalOmzet = botsautoOmzet + spinOmzet + spiegelOmzet + spookOmzet + hawaiiOmzet + ladderOmzet;
		System.out.println("De totale omzet van de kermis is " + totaalOmzet + " euro.");
	}
}

