package com.inter;

public class Caller {
  public static void call() {
	  LibraryClass.LibraryMethod(new Temp());
	  LibraryClass.LibraryMethod(new Temp2());
  }
}


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
	
}