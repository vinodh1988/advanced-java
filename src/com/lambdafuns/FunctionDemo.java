package com.lambdafuns;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
//Function takes one input and produces on output
public class FunctionDemo {
   public static void main(String n[]) {
	   Function<String,Integer> lengthCalculator = (x) -> x.length();
	   
	   String names[]= {"Joseph","Damien","Surendhar","Jagadeesh","Vishweswar",
			   "Nicholas","Christopher","Munaf"};
	   
	   Integer lengths[]=new Integer[names.length];
	     for(int x=0;x<names.length;x++) {
	    	 lengths[x] = lengthCalculator.apply(names[x]);
	     }
	     System.out.println(Arrays.asList(lengths));
	   }
   }

