package Kermis;

class Kassa {
	
	private double totaalOmzet = 0.00;
	
	void omzetTotaal(	String botsNaam, double botsOmzet,
						String spinNaam, double spinOmzet, 
						String spiegelNaam, double spiegelOmzet, 
						String spookNaam, double spookOmzet, 
						String hawaiiNaam, double hawaiiOmzet,
						String ladderNaam, double ladderOmzet) {
		
		totaalOmzet = botsOmzet + spinOmzet + spiegelOmzet + spookOmzet + hawaiiOmzet + ladderOmzet;
		System.out.println("De totale omzet van de kermis is " + totaalOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + botsNaam + "\" is " + botsOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + spinNaam + "\" is " + spinOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + spiegelNaam + "\" is " + spiegelOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + spookNaam + "\" is " + spookOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + hawaiiNaam + "\" is " + hawaiiOmzet + " euro.");
		System.out.println("De omzet van de attractie \"" + ladderNaam + "\" is " + ladderOmzet + " euro.");
	}
}
