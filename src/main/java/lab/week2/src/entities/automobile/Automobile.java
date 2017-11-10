package lab.week2.src.entities.automobile;

import lab.week2.src.entities.Vehicle;

public abstract class Automobile extends Vehicle {
	private String color = "black";
	private final String manufacturer;

	public Automobile(String manufacturer) {
		super();
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

}
