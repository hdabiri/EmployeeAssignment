
public enum Role {
	
	ENGINEER(1),TESTER(2), LEAD(3) , PRESIDENT(4);
	
	private final int value;
	
	Role(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
