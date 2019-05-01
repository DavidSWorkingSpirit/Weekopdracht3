package Kermis;

abstract class RisicoRijkeAttracties extends Attractie{
	
	int draaiLimiet;
	
	abstract void opstellingsKeuring();
	
	void setDraaiLimiet(int draaiLimiet) {
		this.draaiLimiet = draaiLimiet;
	}
}
