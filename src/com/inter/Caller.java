package com.inter;

public class Caller {
  public static void call() {
	  
	  //anonymous class
	  LibraryClass.LibraryMethod(new Task() {

		@Override
		public void activity(String name) {
			// TODO Auto-generated method stub
			System.out.println("running"+name);
			System.out.println("Caller activity done");
		}
		  
	  });
	  
	  
	  //lambda syntax
	  System.out.println("--------------------------------------");
	  LibraryClass.LibraryMethod( (name)-> {

			System.out.println("RUNNING"+name);
			System.out.println("CCCAALLLER activity done");
		  
	  });
  }
}

/*
class Temp implements Task{

	@Override
	public void activity(String name) {
		// TODO Auto-generated method stub
		System.out.println("running"+name);
		System.out.println("Caller activity done");
	}
	
}

class Temp2 implements Task{

	@Override
	public void activity(String name) {
		// TODO Auto-generated method stub
		System.out.println("RUNNING"+name);
		System.out.println("CCCAALLLER activity done");
	}
	
}*/