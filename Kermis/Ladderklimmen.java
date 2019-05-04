package Kermis;

class Ladderklimmen extends Attractie implements GokAttractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	double omzetMetBelasting;
	double totaalOmzet;
	
	@Override
	void draaien(String naam, double prijs) {
		
		this.naam = naam;
		this.prijs = prijs;
		
		System.out.println("De attractie \"" + this.naam + "\" draait.");
		this.aantalKaartjes = this.aantalKaartjes + 1;
		Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
		this.omzet = this.omzet + this.prijs;
		Application.beurt++;
	}
	
	public void kansSpelBelastingBetalen() {

		BelastingInspecteur bob = new BelastingInspecteur();
		omzetMetBelasting= bob.belastingInnen(0.30, this.omzet);
		totaalOmzet = totaalOmzet + omzetMetBelasting;
		omzet = 0;
	}
}
