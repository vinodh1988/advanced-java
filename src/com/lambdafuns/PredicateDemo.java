package com.lambdafuns;

import java.util.function.Predicate;

public class PredicateDemo {
   public static void main(String n[]) {
	   Predicate<String> lengthy =(x) -> x.length()>10 ? true: false;
	   Predicate<Integer> even =(x) -> x%2==0 ? true: false;
	   
	   String strings[]= {"Naveen","Harrison","Peterson","NicholasCopernicus",
			   "Abraham Lincoln"};
	   
	   for(String x:strings)
	   {
		   if(lengthy.test(x))
			   System.out.println(x);
		  
		   if(even.test(x.length()))
			   System.out.println(x+ " has even length");
	   }
   }
}
