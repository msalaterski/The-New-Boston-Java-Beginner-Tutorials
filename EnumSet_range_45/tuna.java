package EnumSet_range_45;

public enum tuna {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iwish", "16");
	
	private final String desc;
	private final String year;
	
	tuna(String description, String birthday) { //birthday is a stupid variable for year
		desc = description;
		year = birthday;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
	 
}
