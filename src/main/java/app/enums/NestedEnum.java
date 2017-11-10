package app.enums;

public class NestedEnum{
	public static void main(String[] args) {
		printEnum(ParentA.CHILDA);
		printEnum(ParentB.CHILDA);
		
	}
	
	static void printEnum(Master enumType) {
		System.out.println(enumType.getVal());
	}
}

interface Master{
	int getVal();
}

enum ParentA implements Master{
	CHILDA(100),CHILDB(101);
	
	int val;

	private ParentA(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	
}

enum ParentB implements Master{
	CHILDA(100),CHILDB(101);
	int val;
	private ParentB(int val) {
		this.val = val;
	}
	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		return val;
	}
	
}
