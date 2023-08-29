package org;

import java.util.ArrayList;

class IntWrapper {
	private int intValue;

	public IntWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

}

public class App {

	public static void main(String[] args) {
		ArrayList<IntWrapper> rollNo = new ArrayList<>();
		rollNo.add(new IntWrapper(12));
		System.out.println(rollNo.get(0).getIntValue());

		// AutoBoxing
		ArrayList<Double> demo = new ArrayList<>();
		demo.add(Double.valueOf(25.5));

		// Unboxing
		System.out.println(demo.get(0).doubleValue());

	}

}
