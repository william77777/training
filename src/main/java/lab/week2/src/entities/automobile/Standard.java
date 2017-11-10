package lab.week2.src.entities.automobile;

import java.time.LocalDate;

public class Standard extends Automobile {

	private LocalDate date;
	private int seats;

	public Standard(String manufacturer) {
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
