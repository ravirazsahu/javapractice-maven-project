package com.practice1.designpattern;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Beer {
	
	//required
    private String name;
    private double drinkSize;
    private double alcoholPercentage;
    private double price;

    // Other attributes
    private String brewery;            // The brewery that produces the beer.
    private String countryOfOrigin;    // The country where the beer is originally from.
    private String description;        // A brief description of the beer's characteristics.
    private String packaging;          // The packaging type (bottle, can, draft, etc.).
    private String servingTemperature; // The recommended serving temperature.
    private String foodPairing;    

}
