package Kermis;

class Botsauto extends Attractie {

	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		
//		this.naam = naam;
//		this.prijs = prijs;
		
		System.out.println("De attractie \"" + this.naam + "\" draait.");
		this.aantalKaartjes = this.aantalKaartjes + 1;
		Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
		this.omzet = this.omzet + this.prijs;
	}
}