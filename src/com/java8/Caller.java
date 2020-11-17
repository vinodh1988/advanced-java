package com.java8;

public class Caller {
   public static void run() {
	   Sample s =new First();
	   s.process();
	   s.helper();
	   
	   s = new Sample() {

			@Override
			public void process() {
				// TODO Auto-generated method stub
				System.out.println("Adhoc Definition for process");
			}
		
			 @Override
				public void helper() {
					// TODO Auto-generated method stub
					System.out.println("Spot helper");
				}
	   };
	   
	   s.process();
	   s.helper();
	   
	   
	   s= ()->{
		   System.out.println("Super lambda also possible");
	   };
	   
	   s.process();
	   s.helper();
	   
	   Sample.fine();
	   
   }
}
