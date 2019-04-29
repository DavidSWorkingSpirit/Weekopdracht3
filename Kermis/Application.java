package Kermis;

import java.util.Scanner;

public class Application {
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		Kassa ka = new Kassa();
		
		Botsauto ba = new Botsauto();
		Spin sp = new Spin();
		
		boolean running = true;
		
		while(running)	{
			String invoer = sc.nextLine();
			
			switch(invoer) {
				case "1": {
					ba.draaien();
					ba.aantalKaartjes = ba.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					ba.omzet = ba.omzet + ba.prijs;
					Kassa.totaalOmzet = Kassa.totaalOmzet + ba.prijs;
					break;
				}
				case "2": {
					sp.draaien();
					sp.aantalKaartjes = sp.aantalKaartjes + 1;
					Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
					sp.omzet = sp.omzet + sp.prijs;
					Kassa.totaalOmzet = Kassa.totaalOmzet + sp.prijs;
					break;
				}
				case "o": {
					ka.omzetTotaal();
					System.out.println(Kassa.totaalOmzet);
					break;
				}
				case "k": {
					System.out.println(Attractie.totaalKaartjesVerkocht);
					break;
				}
				default: {
					System.out.println("Deze invoer is onjuist. Voer een getal in van 1 t/m 6.");
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
}

class Botsauto extends Attractie {
	// setName(); checken
	String naam = "botsauto's";
	double prijs = 2.50;
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + naam + "\" draait.");
	}
}

class Spin extends Attractie {
	
	String naam = "de Spin";
	double prijs = 2.25;
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + naam + "\" draait.");
	}
}

class Kassa {
	
	static double totaalOmzet = 0.00;
	
	double omzetTotaal() {
		return totaalOmzet;
	}
}

