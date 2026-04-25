package com.gl;

public enum CustomerType {
	GOLD(0.10),SILVER(1.05);
	private final double discount;
	CustomerType(double d) {
		// TODO Auto-generated constructor stub
		discount = d;
	}
	public double getDiscount() {
		return discount;
	}
}
