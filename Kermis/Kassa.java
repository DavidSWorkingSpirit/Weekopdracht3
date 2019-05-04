package Kermis;

import java.text.DecimalFormat;

class Kassa {
	
	private double totaalOmzetMetBelasting = 0.00;
	private double totaalOmzet = 0.00;
	DecimalFormat df = new DecimalFormat("####0.00");
	
	void omzetTotaal(	String botsNaam, double botsOmzet,
						String spinNaam, double spinTotaleOmzet, 
						String spiegelNaam, double spiegelOmzet, 
						String spookNaam, double spookOmzet, 
						String hawaiiNaam, double hawaiiOmzet,
						String ladderNaam, double ladderTotaleOmzet,
						double spinOmzet, double ladderOmzet) {
		
		totaalOmzetMetBelasting = botsOmzet + spinTotaleOmzet + spiegelOmzet + spookOmzet + hawaiiOmzet + ladderTotaleOmzet;
		totaalOmzet = botsOmzet + spinOmzet + spiegelOmzet + spookOmzet + hawaiiOmzet + ladderOmzet;
		
		if(spinTotaleOmzet != 0 || ladderTotaleOmzet != 0) {
			System.out.println("De totale omzet van de kermis is " + df.format(totaalOmzetMetBelasting) + " euro.");
		}
		else {
			System.out.println("De totale omzet van de kermis is " + df.format(totaalOmzet) + " euro.");
		}
		
		System.out.println("De omzet van de attractie \"" + botsNaam + "\" is " + df.format(botsOmzet) + " euro.");
		
		if(spinTotaleOmzet != 0) {
			System.out.println("De omzet van de attractie \"" + spinNaam + "\" is " + df.format(spinTotaleOmzet) + " euro.");
		}
		else {
			System.out.println("De omzet van de attractie \"" + spinNaam + "\" is " + df.format(spinOmzet) + " euro.");
		}
		System.out.println("De omzet van de attractie \"" + spiegelNaam + "\" is " + df.format(spiegelOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + spookNaam + "\" is " + df.format(spookOmzet) + " euro.");
		System.out.println("De omzet van de attractie \"" + hawaiiNaam + "\" is " + df.format(hawaiiOmzet) + " euro.");
		
		if(ladderTotaleOmzet != 0) {
			System.out.println("De omzet van de attractie \"" + ladderNaam + "\" is " + df.format(ladderTotaleOmzet) + " euro.");
		}
		else {
			System.out.println("De omzet van de attractie \"" + ladderNaam + "\" is " + df.format(ladderOmzet) + " euro.");
		}
	}
	
	void kaartjesTotaal(	String botsNaam, int botsKaart,
							String spinNaam, int spinKaart,
							String spiegelNaam, int spiegelKaart,
							String spookNaam, int spookKaart,
							String hawaiiNaam, int hawaiiKaart,
							String ladderNaam, int ladderKaart) {
		
		System.out.println("Het totale aantal verkochte kaartjes is: " + Attractie.totaalKaartjesVerkocht + ".");
		System.out.println("Voor de attractie " + botsNaam + " zijn " + botsKaart + " kaartjes gekocht.");
		System.out.println("Voor de attractie " + spinNaam + " zijn " + spinKaart + " kaartjes gekocht.");
		System.out.println("Voor de attractie " + spiegelNaam + " zijn " + spiegelKaart + " kaartjes gekocht.");
		System.out.println("Voor de attractie " + spookNaam + " zijn " + spookKaart + " kaartjes gekocht.");
		System.out.println("Voor de attractie " + hawaiiNaam + " zijn " + hawaiiKaart + " kaartjes gekocht.");
		System.out.println("Voor de attractie " + ladderNaam + " zijn " + ladderKaart + " kaartjes gekocht.");
	}
}
