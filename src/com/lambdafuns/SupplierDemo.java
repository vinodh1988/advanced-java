package com.lambdafuns;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String n[]) {
	  Supplier<String[]> cityProvider = () -> Constants.cities;
	  Supplier<String[]> countryProvider = () ->Constants.countries;
	  
	  System.out.println(Arrays.asList(cityProvider.get()));
	  System.out.println(Arrays.asList(countryProvider.get()));
  }
}
