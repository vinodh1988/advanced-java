package com.run;

import com.lambdamore.Factory;
import com.lambdamore.Helpers;
import com.lambdamore.Task;

//Works with package com.lambda more
//In this example we are going to check method reference operator ::
public class Executor6 {
   public static void main(String n[]) {
	   //Factory.perform(Helpers::measuring,"Ingredients");
	   //Way 1
	 /*  Factory.perform(new Impl(), "my task");
	  //Way 2 
	   Factory.perform(new Task() {

		@Override
		public void activity(String name) {
			// TODO Auto-generated method stub
			System.out.println("PERFORM"+name);
		}
		   
	   },"Activity Anonymous");*/
	   
	   //Way 3
	 //  Factory.perform((name)-> System.out.println("Performing"+name), " Activity 1");
     
	   Factory.perform(Helpers::measuring,"ingredients");
	   Factory.perform(Helpers::mixing,"ingredients");
	   Factory.perform(Helpers::heating,"mixture");
	   Factory.perform(Helpers::cooling,"product");
	   Factory.perform(Helpers::packing,"product");
   }
}

class Impl implements Task{

	@Override
	public void activity(String name) {
		// TODO Auto-generated method stub
		System.out.println("Activity "+name);
	}
	
}
