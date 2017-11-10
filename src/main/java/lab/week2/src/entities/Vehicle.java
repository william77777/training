package lab.week2.src.entities;

public abstract class Vehicle {
	private long vin;
	private int range;
	private double price;
	private int code;

	protected Vehicle() {
		// use setters to set variables
	}

	public abstract String getDisplayInfo();

	public abstract int calculateRange();

	public long getVin() {
		return vin;
	}

	public int getRange() {
		return range;
	}

	public double getPrice() {
		return price;
	}

	public int getCode() {
		return code;
	}

	protected void setVin(long vin) {
		this.vin = vin;
	}

	protected void setRange(int range) {
		this.range = range;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected void setCode(int code) {
		this.code = code;
	}

}
