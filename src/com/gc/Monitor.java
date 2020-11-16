package com.gc;
//every class is a sub class of object class
public class Monitor {
    
	private String name;
	
	public static void callMe() {
		System.out.println("CALLED MONITOR STATIC METHOD");
	}
	
	public Monitor(String name) {
		this.name = name;
	}
	//it runs exactly once , when the class is loaded
	static {
		System.out.println("Monitor class is loaded");
	}
	
	@Override
	public String toString() {
		return name;
	}
//this 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(name+ " is deleted");
	}
	
	
}
