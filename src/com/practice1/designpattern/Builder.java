package com.practice1.designpattern;

public class Builder {

	
	public String createStandardBeer() {
        Beer beer = Beer.builder()
                .name("Standard Beer")
                .drinkSize(500)
                .alcoholPercentage(5.0)
                .price(5.99)
                .build();

        return "Created beer: " + beer.getName() + 
                ", Drink Size: " + beer.getDrinkSize() +
                ", Alcohol Percentage: " + beer.getAlcoholPercentage() +
                ", Price: " + beer.getPrice();
    }
}
