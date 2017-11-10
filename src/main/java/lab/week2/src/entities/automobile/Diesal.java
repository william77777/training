package lab.week2.src.entities.automobile;

public class Diesal extends Automobile {

	private int wheels;
	private int cylinders;

	public Diesal(String manufacturer) {
		super(manufacturer);
		// TODO Auto-generated constructor stub
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

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

}
