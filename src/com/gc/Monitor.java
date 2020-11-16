package com.gc;
//every class is a sub class of object class
public class Monitor {
    
	private String name;
	
	public Monitor(String name) {
		this.name = name;
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
