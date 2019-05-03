package Kermis;

import java.text.DecimalFormat;

class Kassa {
	
	private double totaalOmzet = 0.00;
	DecimalFormat df = new DecimalFormat("####0.00");
	
	void omzetTotaal(	String botsNaam, double botsOmzet,
						String spinNaam, double spinOmzet, 
						String spiegelNaam, double spiegelOmzet, 
						String spookNaam, double spookOmzet, 
						String hawaiiNaam, double hawaiiOmzet,
						String ladderNaam, double ladderOmzet) {
		
		totaalOmzet = botsOmzet + spinOmzet + spiegelOmzet + spookOmzet + hawaiiOmzet + ladderOmzet;
		System.out.println("De totale omzet van de kermis is " + df.format(totaalOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + botsNaam + "\" is " + df.format(botsOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + spinNaam + "\" is " + df.format(spinOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + spiegelNaam + "\" is " + df.format(spiegelOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + spookNaam + "\" is " + df.format(spookOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + hawaiiNaam + "\" is " + df.format(hawaiiOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + ladderNaam + "\" is " + df.format(ladderOmzet) + " euro.");
	}
}
