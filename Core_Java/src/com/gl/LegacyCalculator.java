package com.gl;

import java.util.Map;

public class LegacyCalculator {

    public static Map<String,Double> map = Map.of("GOLD",0.10,"SILVER",0.05);
    public int calculateLoyaltyPoints(String customerType, double purchaseAmount) {
        /*if (customerType == null || customerType.trim().isEmpty()) {
            // Default to the lowest tier if type is missing
            return (int) (purchaseAmount * 0.01);
        }

        String type = customerType.toUpperCase();

        if ("GOLD".equals(type)) {
            // Gold tier logic: 10%
            return (int) (purchaseAmount * 0.10);
        } else if ("SILVER".equals(type)) {
            // Silver tier logic: 5%
            return (int) (purchaseAmount * 0.05);
        } else {
            // Bronze/Default logic: 1%
            return (int) (purchaseAmount * 0.01);
        }*/
    	// if we use map use below line
    	//double discount = map.getOrDefault(customerType, 0.01);
    	//if we use enum use below line
    	double discount = CustomerType.valueOf(customerType).getDiscount();
    	return (int)(purchaseAmount*discount);
    }
    //
}
