package lab.week2.src.entities.Boat;

import lab.week2.src.entities.Vehicle;
import lab.week2.src.entities.enums.BoatType;

public class Boat extends Vehicle {

	private final BoatType boatType;
	private final double luxuryTax;
	
	public Boat(BoatType boatType) {
		super();
		this.boatType = boatType;
		this.luxuryTax = this.calculateLuxuryTax();
	}
	
	private double calculateLuxuryTax() {
		switch(this.boatType) {
			// determine tax based on boat type
		}
		return 0.0;
	}

	@Override
	public String getDisplayInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculateRange() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BoatType getBoatType() {
		return boatType;
	}

	public double getLuxuryTax() {
		return luxuryTax;
	}
	
	

}
