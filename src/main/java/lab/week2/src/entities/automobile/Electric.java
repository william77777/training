package lab.week2.src.entities.automobile;

import lab.week2.src.entities.enums.Rule;

public class Electric extends Automobile {

	private int batteries;
	private boolean isTesla;
	private Rule rule;

	public Electric(String manufacturer) {
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

	public int getBatteries() {
		return batteries;
	}

	public void setBatteries(int batteries) {
		this.batteries = batteries;
	}

	public boolean isTesla() {
		return isTesla;
	}

	public void setTesla(boolean isTesla) {
		this.isTesla = isTesla;
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

}
