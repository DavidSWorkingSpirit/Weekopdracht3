package Kermis;

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