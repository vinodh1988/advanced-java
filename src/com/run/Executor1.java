package com.run;

import com.gc.Monitor;

public class Executor1 {
  public static void main(String[] args) {
	Monitor m=new Monitor("one");
	Monitor m1=new Monitor("two");
	Monitor m2=new Monitor("three");
	m=new Monitor("Four");
	m1=m;
	System.gc();
	System.out.println("Program done");
	
  }
}
