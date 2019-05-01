package Kermis;

class Ladderklimmen extends Attractie implements GokAttractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	double omzetMetBelasting;
	double totaalOmzet;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
	
	public void kansSpelBelastingBetalen(double belasting) {
		omzetMetBelasting = omzet - omzet * belasting;
		totaalOmzet = totaalOmzet + omzetMetBelasting;
		omzet = 0;
	}
}