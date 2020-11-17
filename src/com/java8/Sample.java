package com.java8;

public interface Sample {
   void  process();
   
   default void helper() {
	   System.out.println("this is a helper method");
   }
   
   default void fine() {
	   System.out.println("Additional method");
   }
}
 
// Lambda expression is possible only for functional interface
// interface with exactly one unimplemented method - functional interface