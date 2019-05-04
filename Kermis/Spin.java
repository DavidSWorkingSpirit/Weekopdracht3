package Kermis;

class Spin extends RisicoRijkeAttracties implements GokAttractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	int aantalGedraaid = 0;
	double omzetMetBelasting;
	double totaalOmzet;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
		this.aantalKaartjes = this.aantalKaartjes + 1;
		Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
		this.omzet = this.omzet + this.prijs;
//		totaalOmzet = omzet;
	}
	
	void opstellingsKeuring() {
		System.out.println("De attractie \"" + this.naam + "\" ondergaat een onderhoudsbeurt.");
		this.aantalGedraaid = 0;
	}
	
	public void kansSpelBelastingBetalen() {

		BelastingInspecteur bob = new BelastingInspecteur();
		omzetMetBelasting= bob.belastingInnen(0.30, this.omzet);
		totaalOmzet = totaalOmzet + omzetMetBelasting;
		omzet = 0;
	}
}
