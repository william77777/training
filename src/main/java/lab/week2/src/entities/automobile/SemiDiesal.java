package lab.week2.src.entities.automobile;

import lab.week2.src.entities.enums.Rule;

public class SemiDiesal extends Diesal {

	private Rule rule;
	
	public SemiDiesal(String manufacturer) {
		super(manufacturer);
		// TODO Auto-generated constructor stub
	}

	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}
	
	

}
