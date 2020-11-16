package com.run;

public class Executor1 {
	static {
		System.out.println("Executor 1 is loaded");
	}
  public static void main(String[] args) {
	  try {
		Class.forName("com.gc.Monitor");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 /* Monitor.callMe();
	  Monitor.callMe();
	  Monitor.callMe();
	  Monitor.callMe();*/
	/*Monitor m=new Monitor("one");
	Monitor m1=new Monitor("two");
	Monitor m2=new Monitor("three");
	m=new Monitor("Four");
	m1=m;
	System.gc();
	System.out.println("Program done");*/
	
  }
}
