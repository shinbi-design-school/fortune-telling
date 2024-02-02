package com.design_shinbi.fortune_telling;

public enum Result { //enum: enumeartion　列挙型
	DAIKICHI("大吉"),
	KICHI("吉"),
	CHUKICHI("中吉"),
	SHOKICHI("小吉"),
	SUEKICHI("末吉"),
	KYOU("凶");
	
	private String name;
	
	Result(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static Result getRandom() {
		Result[] values = values();
		
		double random = Math.random();
		int index = (int)Math.floor(random * (double)values.length);
		return values[index];
	}
}