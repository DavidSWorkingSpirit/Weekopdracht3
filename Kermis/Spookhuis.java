package Kermis;

class Spookhuis extends Attractie {
	
	int oppervlakte;
	double omzet;
	int aantalKaartjes;
	
	@Override
	void draaien() {
		System.out.println("De attractie \"" + this.naam + "\" draait.");
	}
}