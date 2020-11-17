package com.lambdafuns;

import java.util.function.Consumer;

//Consumer is a a function which takes an input of(any object type) and process it
//returns nothing
public class ConsumerDemo {
   public static void main(String[] args) {
	Consumer<String> consumer = (x) -> System.out.println("Cooking "+x);
	Consumer<String> server = (x)->System.out.println("Serving " + x);
	
	String []items = {"Roti","Bread","Sauce","Soup", "Beans","Naan"};
	
	for(String x: items) {
		consumer.accept(x);
	    server.accept(x);
	    System.out.println("-----------------------") ; 
	}
	
  }
}
