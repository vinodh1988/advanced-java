package com.java8;

public interface Sample {
	
   void  process();
   
   default void helper() {
	   System.out.println("this is a helper method");
	  
   }
   
   static void fine() {
	   System.out.println("Static method");
   }
   
  
}
 
// Lambda expression is possible only for functional interface
// interface with exactly one unimplemented method - functional interface