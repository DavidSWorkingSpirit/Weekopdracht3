package Kermis;

class Hawaii extends RisicoRijkeAttracties {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	int aantalGedraaid = 0;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
		this.aantalKaartjes = this.aantalKaartjes + 1;
		Attractie.totaalKaartjesVerkocht = Attractie.totaalKaartjesVerkocht + 1;
		this.omzet = this.omzet + this.prijs;
	}
	
	void opstellingsKeuring() {
		System.out.println("De attractie \"" + this.naam + "\" ondergaat een onderhoudsbeurt.");
		this.aantalGedraaid = 0;
	}
}