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
	
	public void kansSpelBelastingBetalen() {

		BelastingInspecteur bob = new BelastingInspecteur();
		omzetMetBelasting= bob.belastingInnen(0.30, this.omzet);
		totaalOmzet = totaalOmzet + omzetMetBelasting;
		omzet = 0;
	}
}
