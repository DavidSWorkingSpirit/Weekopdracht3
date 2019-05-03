package Kermis;

public class BelastingInspecteur {
	
	double omzetMetBelasting;
	
	double belastingInnen(double belasting, double attractieOmzet) {
		omzetMetBelasting = attractieOmzet - attractieOmzet * belasting;
		
		return omzetMetBelasting;
	}
}
